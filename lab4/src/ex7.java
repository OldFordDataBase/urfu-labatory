public class ex7 {

    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        int[][] array = new int[rows][cols];

        int counter = 1;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (top <= bottom && left <= right) {
            // Слева направо (верхняя строка)
            for (int i = left; i <= right; i++) {
                array[top][i] = counter++;
            }
            top++; // Сдвигаем верхнюю границу

            // Сверху вниз (правый столбец)
            for (int i = top; i <= bottom; i++) {
                array[i][right] = counter++;
            }
            right--; // Сдвигаем правую границу

            // Справа налево (нижняя строка)
            if (top <= bottom) { // Проверка, чтобы не дублировать
                for (int i = right; i >= left; i--) {
                    array[bottom][i] = counter++;
                }
                bottom--; // Сдвигаем нижнюю границу
            }

            // Снизу вверх (левый столбец)
            if (left <= right) { // Проверка, чтобы не дублировать
                for (int i = bottom; i >= top; i--) {
                    array[i][left] = counter++;
                }
                left++; // Сдвигаем левую границу
            }
        }

        System.out.println("Массив, заполненный \"змейкой\" (спиралью):");
        printArray(array);
    }

    // Вспомогательный метод для вывода
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.printf("%-4d", val);
            }
            System.out.println();
        }
    }
}