import java.util.Random;

public class ex6 {

    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] original = new int[rows][cols];
        Random random = new Random();

        // Заполнение
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Исходный массив (5x5):");
        printArray(original);

        // Выбор строки и столбца для удаления
        int rowToRemove = random.nextInt(rows); // 0 to 4
        int colToRemove = random.nextInt(cols); // 0 to 4
        System.out.println("\nУдаляем строку: " + rowToRemove);
        System.out.println("Удаляем столбец: " + colToRemove);

        // Создание нового массива
        int[][] result = new int[rows - 1][cols - 1];
        int newRow = 0; // Индекс строки для нового массива

        for (int i = 0; i < rows; i++) {
            // Пропускаем удаляемую строку
            if (i == rowToRemove) {
                continue;
            }
            int newCol = 0; // Индекс столбца для нового массива
            for (int j = 0; j < cols; j++) {
                // Пропускаем удаляемый столбец
                if (j == colToRemove) {
                    continue;
                }
                // Копируем элемент
                result[newRow][newCol] = original[i][j];
                newCol++;
            }
            newRow++;
        }

        System.out.println("\nРезультирующий массив (4x4):");
        printArray(result);
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