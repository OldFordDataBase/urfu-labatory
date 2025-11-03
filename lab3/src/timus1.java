import java.util.Scanner;

public class timus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем n
        int n = scanner.nextInt();

        // Суммируем все бум-бумы
        long totalBombs = 0;
        for (int i = 0; i < n; i++) {
            totalBombs += scanner.nextInt();
        }

        // Дроидов изначально n
        long droids = n;

        // Неиспользованные бум-бумы
        long unusedBombs = Math.max(0, totalBombs - droids);

        // Выжившие дроиды
        long survivedDroids = Math.max(0, droids - totalBombs);

        System.out.println(unusedBombs + " " + survivedDroids);
    }
}
