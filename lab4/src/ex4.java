public class ex4 {
    public static void main(String[] args) {
        int size = 8;
        int[][] array = new int[size][size];

        // Заполнение "треугольника"
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = 1;
            }
        }

        // Вывод
        System.out.println("Прямоугольный треугольник в массиве: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}