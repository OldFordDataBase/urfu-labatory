public class ex3 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 8;
        int[][] array = new int[rows][cols];

        // Заполнение
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 2;
            }
        }

        // Вывод
        System.out.println("Прямоугольник из цифр 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}