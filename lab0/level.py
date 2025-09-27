import pygame
from settings import TILE, COLORS

class Level:
    """
    Хранит карту (grid) и даёт удобные интерфейсы:
    """
    def __init__(self, raw_map):
        # raw_map: list of strings
        self.grid = [list(row) for row in raw_map]
        self.h = len(self.grid)
        self.w = len(self.grid[0]) if self.h > 0 else 0

    def find(self, symbol):
        for y, row in enumerate(self.grid):
            for x, ch in enumerate(row):
                if ch == symbol:
                    return (x, y)
        return None

    def get(self, x, y):
        return self.grid[y][x]

    def set(self, x, y, ch):
        self.grid[y][x] = ch

    def open_doors(self):
        """Заменяет все 'D' на '.' — вызывается при нажатии кнопки в другом мире"""
        for y in range(self.h):
            for x in range(self.w):
                if self.grid[y][x] == "D":
                    self.grid[y][x] = "."

    def draw(self, surface, offset_y):
        """Отрисовать тайлы карты на surface с вертикальным смещением offset_y"""
        for y, row in enumerate(self.grid):
            for x, ch in enumerate(row):
                color = COLORS.get(ch, (0, 0, 0))
                rect = pygame.Rect(x * TILE, offset_y + y * TILE, TILE, TILE)
                pygame.draw.rect(surface, color, rect)
                # рамка клетки для ретро-стиля
                pygame.draw.rect(surface, (10, 10, 10), rect, 1)

    def in_bounds(self, x, y):
        return 0 <= x < self.w and 0 <= y < self.h