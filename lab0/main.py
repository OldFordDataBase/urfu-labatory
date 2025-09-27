import pygame
import sys
from settings import LEVELS, TILE, HEADER, GAP
from game import Game

def compute_window_size(top_map, bottom_map):
    top_h = len(top_map)
    bottom_h = len(bottom_map)
    max_w = max(len(r) for r in top_map + bottom_map)
    width = max_w * TILE
    height = HEADER + top_h * TILE + GAP + bottom_h * TILE
    return width, height

def menu_loop():
    pygame.init()
    clock = pygame.time.Clock()

    # простое меню выбора уровня
    font = pygame.font.SysFont("Consolas", 28)
    small = pygame.font.SysFont("Consolas", 14)

    while True:
        # нарисуем статичное меню (окно размера по первому уровню)
        width, height = compute_window_size(LEVELS[0][0], LEVELS[0][1])
        screen = pygame.display.set_mode((width, height))
        pygame.display.set_caption("Две Реальности — Меню")

        screen.fill((8, 8, 8))
        title = font.render("Две Реальности", True, (220, 220, 220))
        screen.blit(title, (20, 10))

        hint = small.render("Выберите уровень: 1-6. Нажмите Esc, чтобы выйти.", True, (180, 180, 180), )
        screen.blit(hint, (20, 50))

        for i, (top, bottom) in enumerate(LEVELS, 1):
            line = small.render(f"{i}. Уровень {i} — размер {len(top[0])}x{len(top)} / {len(bottom[0])}x{len(bottom)}", True, (200, 200, 200))
            screen.blit(line, (20, 50 + i * 26))

        pygame.display.flip()

        # ждать события выбора
        chosen = None
        while chosen is None:
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    pygame.quit()
                    sys.exit()
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_ESCAPE:
                        pygame.quit()
                        sys.exit()
                    if pygame.K_1 <= event.key <= pygame.K_6:
                        chosen = event.key - pygame.K_1  # индекс уровня
            clock.tick(30)

        # по выбранному уровню — пересоздаём окно с подходящим размером
        top_map, bottom_map = LEVELS[chosen]
        width, height = compute_window_size(top_map, bottom_map)
        screen = pygame.display.set_mode((width, height))
        pygame.display.set_caption(f"Две Реальности — Уровень {chosen+1}")

        # запустить уровень
        game = Game(top_map, bottom_map, screen, clock)
        result = game.run()  # None = выход из приложения, True/False = win/dead/menu

        if result is None:
            # вышли из приложения
            pygame.quit()
            sys.exit()

        # после уровня возвращаемся в меню (игроку надо нажать Esc в run, либо умер/победа)
        # небольшой пауз/информирование можно добавить здесь, но для простоты — вернёмся в меню.
        # loop продолжится и снова покажет меню

if __name__ == "__main__":
    menu_loop()