class AverageCalculator {
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) return 0.0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}

// Пример использования
public class nom8 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Среднее: " + AverageCalculator.calculateAverage(numbers)); // 30.0
    }
}