import java.util.Scanner;

public class timus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение входных данных до конца ввода
        while (scanner.hasNext()) {
            long a = scanner.nextLong();
            if (a == 0) break; // Прерываем, если встретили 0 (по условию примера)

            // Вычисление обратного квадратного корня
            double result = 1.0 / Math.sqrt(a);

            // Вывод с 9 знаками после запятой
            System.out.printf("%.9f%n", result);
        }

        scanner.close();
    }
}