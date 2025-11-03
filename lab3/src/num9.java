import java.util.Random;

public class num9 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random rnd = new Random();

        // Заполняем случайными числами от 0 до 99
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }

        System.out.print("Массив: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        // Находим минимум
        int min = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
        }

        // Выводим все индексы с минимальным значением
        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
