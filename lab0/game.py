import pygame
from level import Level
from player import Player
from settings import TILE, GAP, HEADER, FPS

class Game:
    """
    Game управляет игровым циклом уровня:
      - принимает ввод (один шаг: dx,dy) — оба игрока пытаются пройти
      - запускает анимацию (обновление всех игроков, отрисовка)
      - проверяет смерть / победу
    """
    def __init__(self, top_map, bottom_map, surface, clock):
        self.top_level = Level(top_map)
        self.bottom_level = Level(bottom_map)
        self.surface = surface
        self.clock = clock

        # стартовые позиции
        top_start = self.top_level.find("@")
        bottom_start = self.bottom_level.find("&")

        if top_start is None or bottom_start is None:
            raise RuntimeError("Каждая карта должна содержать символы @ и & соответственно.")

        self.top_player = Player("@", top_start)
        self.bottom_player = Player("&", bottom_start)

        # координаты для рисования
        self.top_offset = HEADER
        self.bottom_offset = self.top_offset + self.top_level.h * TILE + GAP

        # состояние уровня
        self.won = False
        self.dead = False
        self.message_timer = 0

    def _handle_input(self):
        """
        Читаем нажатия и если оба игрока не находятся в движении,
        пробуем одновременно переместить их на dx,dy.
        """
        keys = pygame.key.get_pressed()
        dx = dy = 0

        # позволяем WASD или стрелки
        if keys[pygame.K_w] or keys[pygame.K_UP]:
            dy = -1
        elif keys[pygame.K_s] or keys[pygame.K_DOWN]:
            dy = 1
        elif keys[pygame.K_a] or keys[pygame.K_LEFT]:
            dx = -1
        elif keys[pygame.K_d] or keys[pygame.K_RIGHT]:
            dx = 1
        else:
            return  # ничего не делать

        # не запускаем новое передвижение, пока идет анимация
        if not self.top_player.can_start_move() or not self.bottom_player.can_start_move():
            return

        # пробуем двоечное перемещение
        moved_top, dead_top, _ = self.top_player.move(dx, dy, self.top_level, self.bottom_level)
        moved_bot, dead_bot, _ = self.bottom_player.move(dx, dy, self.bottom_level, self.top_level)

        if dead_top or dead_bot:
            self.dead = True
            self.message_timer = 60  # показываем сообщение ~1 секунду

    def _update(self):
        # обновляем игроков — они плавно двигаются
        self.top_player.update()
        self.bottom_player.update()

        # проверка победы: оба в своих выходах (E)
        top_tile = self.top_level.get(self.top_player.grid_x, self.top_player.grid_y)
        bot_tile = self.bottom_level.get(self.bottom_player.grid_x, self.bottom_player.grid_y)

        if top_tile == "E" and bot_tile == "E":
            self.won = True
            self.message_timer = 90

        if self.message_timer > 0:
            self.message_timer -= 1

    def _draw_header(self):
        font = pygame.font.SysFont("Consolas", 10)
        text = "Две реальности — пройди обоих (WASD / стрелки). Esc — выход в меню"
        surf = font.render(text, True, (230, 230, 230))
        self.surface.blit(surf, (10, 10))

    def render(self):
        # рисуем всю сцену
        self.surface.fill((12, 12, 12))
        self._draw_header()
        # карта верх
        self.top_level.draw(self.surface, self.top_offset)
        # карта низ
        self.bottom_level.draw(self.surface, self.bottom_offset)
        # игроки
        self.top_player.draw(self.surface, self.top_offset)
        self.bottom_player.draw(self.surface, self.bottom_offset)

        # сообщения
        if self.dead:
            self._draw_center_text("Ты наступил на ловушку! Нажми Esc, чтобы вернуться в меню", (200, 50, 50))
        elif self.won:
            self._draw_center_text("Уровень пройден! Нажми Esc, чтобы выйти в меню", (50, 200, 80))

        pygame.display.flip()

    def _draw_center_text(self, text, color):
        font = pygame.font.SysFont("Consolas", 26)
        surf = font.render(text, True, color)
        r = surf.get_rect(center=(self.surface.get_width() // 2, 30))
        self.surface.blit(surf, r)

    def run(self):
        """Запуск уровня: основной цикл. Возвращает 'True' при победе, 'False' при смерти/выходе."""
        while True:
            self.clock.tick(FPS)
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    return None  # сигнал к полному выходу из приложения
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_ESCAPE:
                        # выйти в меню
                        return False

            # если уже умер или выиграл — позволим только выйти в меню (Esc)
            if not (self.dead or self.won):
                self._handle_input()

            self._update()
            self.render()