public class ex1 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Условие для отрисовки границ
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Заполнение внутри
                }
            }
            System.out.println(); // Переход на новую строку
        }
    }
}