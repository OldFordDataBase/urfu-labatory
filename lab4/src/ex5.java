import java.util.Random;
public class ex5 {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;
        int[][] original = new int[rows][cols];
        Random random = new Random();

        // Заполнение исходного массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = random.nextInt(100); // 0-99
            }
        }
        System.out.println("Исходный массив (3x5):");
        printArray(original);

        // Создание транспонированного массива
        int[][] transposed = new int[cols][rows]; // 5x3

        // Транспонирование
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = original[i][j];
            }
        }

        System.out.println("\nТранспонированный массив (5x3):");
        printArray(transposed);
    }

    // Вспомогательный метод вывода
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.printf("%-4d", val); // %-4d для выравнивания
            }
            System.out.println();
        }
    }
}