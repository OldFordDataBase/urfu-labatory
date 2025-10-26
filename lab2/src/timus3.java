import java.util.Scanner;

public class timus3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String kStr = scanner.next(); // Считываем k или k!

            if (n == 0 && kStr.equals("0")) break; // Условие завершения

            int k = 1; // По умолчанию k = 1 для факториала
            if (kStr.contains("!")) {
                k = Integer.parseInt(kStr.replace("!", "")); // Извлекаем k из k!
            }

            long result = 1;
            if (k == 1) {
                // Стандартный факториал
                for (int i = 2; i <= n; i++) {
                    result *= i;
                }
            } else {
                // Произведение с шагом k
                for (int i = n; i >= 1; i -= k) {
                    result *= i;
                    if (i - k < 1) break; // Останавливаемся, если следующий шаг меньше 1
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }
}