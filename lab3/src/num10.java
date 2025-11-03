import java.util.Random;
import java.util.Arrays;

public class num10 {
    public static void main(String[] args) {
        int size = 12;
        int[] arr = new int[size];
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(100);
        }

        System.out.print("Исходный массив: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        // Сортируем по убыванию (можно через Arrays.sort + reverse)
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, (a, b) -> Integer.compare(b, a));

        System.out.print("Отсортированный по убыванию: ");
        for (int x : boxed) System.out.print(x + " ");
        System.out.println();
    }
}
