import java.util.Arrays;

class ArrayExtractor {
    public static int[] extractElements(int[] arr, int count) {
        if (count >= arr.length) {
            return Arrays.copyOf(arr, arr.length); // возвращаем копию
        } else {
            return Arrays.copyOf(arr, count);
        }
    }
}

// Пример использования
public class nom6 {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] extracted = ArrayExtractor.extractElements(original, 3);
        System.out.println(Arrays.toString(extracted)); // [10, 20, 30]
    }
}