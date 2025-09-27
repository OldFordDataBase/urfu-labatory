import pygame
from settings import TILE, PLAYER_COLORS, MOVE_FRAMES

class Player:
    """
    Player хранит grid_pos (x,y в клетках) и pixel_pos (плоскость),
    поддерживает плавное перемещение между клетками.
    """
    def __init__(self, symbol, start_grid_pos):
        self.symbol = symbol
        self.grid_x, self.grid_y = start_grid_pos
        self.pixel_x = self.grid_x * TILE
        self.pixel_y = self.grid_y * TILE
        self.color = PLAYER_COLORS.get(symbol, (255, 255, 255))

        # движение
        self.target_x = self.grid_x
        self.target_y = self.grid_y
        self.move_frame = 0
        self.is_moving = False

    def can_start_move(self):
        return not self.is_moving

    def move(self, dx, dy, level, other_level):
        """
        Попытаться сдвинуться на dx/dy.
        Возвращает (moved(boolean), died(boolean), pressed_button(boolean))
        Логика:
         - если цель вне bounds или '#'/ 'D' -> не двигаемся
         - если целевой 'B' -> запускаем other_level.open_doors()
         - если 'X' -> игрок движется и умирает (True)
        """
        nx = self.grid_x + dx
        ny = self.grid_y + dy

        if not level.in_bounds(nx, ny):
            return False, False, False

        tile = level.get(nx, ny)
        if tile == "#" or tile == "D":
            return False, False, False

        # можно двигаться — ставим цель (для анимации)
        self.target_x = nx
        self.target_y = ny
        self.is_moving = True
        self.move_frame = 0

        pressed_button = False
        died = False

        if tile == "B":
            # кнопка нажата — открой двери в другом мире
            if other_level is not None:
                other_level.open_doors()
            pressed_button = True
        elif tile == "X":
            died = True

        # фактическое изменение grid-позиции произойдет
        # после того как анимация дойдёт до цели — но мы уже обновляем grid coords
        # чтобы логика (например проверка победы) могла смотреть grid_pos.
        self.grid_x = nx
        self.grid_y = ny

        return True, died, pressed_button

    def update(self):
        """Плавно перемещаем pixel_pos к grid-позиции на MOVE_FRAMES кадров"""
        if not self.is_moving:
            # возможно pixel pos не совпадает — синхронизируем
            self.pixel_x = self.grid_x * TILE
            self.pixel_y = self.grid_y * TILE
            return

        # вычислим желаемые пиксельные координаты
        target_px = self.target_x * TILE
        target_py = self.target_y * TILE

        # интерполяция (линейная)
        self.move_frame += 1
        t = self.move_frame / max(1, MOVE_FRAMES)
        if t >= 1.0:
            # достигли цели
            self.pixel_x = target_px
            self.pixel_y = target_py
            self.is_moving = False
        else:
            # плавное смещение
            start_px = (self.pixel_x if self.move_frame == 1 else (self.target_x - (self.grid_x - (0 if self.is_moving else 0))) * TILE)
            # более простая и стабильная реализация:
            self.pixel_x = (1 - t) * (self.pixel_x) + t * target_px
            self.pixel_y = (1 - t) * (self.pixel_y) + t * target_py

    def draw(self, surface, offset_y):
        rect = pygame.Rect(self.pixel_x, offset_y + self.pixel_y, TILE, TILE)
        pygame.draw.rect(surface, self.color, rect, border_radius=6)
        pygame.draw.rect(surface, (0, 0, 0), rect, 2)