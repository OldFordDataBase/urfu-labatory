import java.util.*;

public class timus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение числа команд и игр
        int n = scanner.nextInt(); // число команд
        int m = scanner.nextInt(); // число игр

        // Массив для хранения очков каждой команды
        int[] scores = new int[n + 1]; // Индексы с 1 до n

        // Чтение результатов игр и подсчёт очков
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt(); // команда A
            int b = scanner.nextInt(); // команда B
            int c = scanner.nextInt(); // очки команды A
            scores[a] += c; // Добавляем очки только команде A
        }

        // Создание списка пар (номер команды, очки) для сортировки
        List<int[]> teams = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            teams.add(new int[]{i, scores[i]});
        }

        // Сортировка: по убыванию очков, при равенстве - по возрастанию номера
        teams.sort((t1, t2) -> {
            if (t2[1] != t1[1]) {
                return t2[1] - t1[1]; // Убывание по очкам
            } else {
                return t1[0] - t2[0]; // Возрастание по номеру
            }
        });

        // Вывод результатов
        for (int[] team : teams) {
            System.out.println(team[0]);
        }

        scanner.close();
    }
}