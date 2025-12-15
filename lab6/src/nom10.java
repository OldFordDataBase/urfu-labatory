import java.util.Arrays;

class MinMaxFinder {
    public static double[] findMinMax(double... args) {
        if (args.length == 0) {
            return new double[]{Double.NaN, Double.NaN};
        }
        double max = Arrays.stream(args).max().orElse(0);
        double min = Arrays.stream(args).min().orElse(0);
        return new double[]{max, min};
    }
}

// Пример использования
public class nom10 {
    public static void main(String[] args) {
        double[] result = MinMaxFinder.findMinMax(10.0, 5.0, 8.0, 12.0, 3.0);
        System.out.printf("Наибольшее: %.2f, Наименьшее: %.2f%n", result[0], result[1]);
    }
}