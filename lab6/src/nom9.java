import java.util.Arrays;

class SwapPairs {
    public static int[] swapPairs(int[] arr) {
        int[] swapped = Arrays.copyOf(arr, arr.length);
        int n = swapped.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = swapped[i];
            swapped[i] = swapped[n - 1 - i];
            swapped[n - 1 - i] = temp;
        }
        return swapped;
    }
}

// Пример использования
public class nom9 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] swapped = SwapPairs.swapPairs(original);
        System.out.println("Оригинал: " + Arrays.toString(original)); // [1, 2, 3, 4, 5]
        System.out.println("Обратный: " + Arrays.toString(swapped));   // [5, 4, 3, 2, 1]
    }
}