import java.util.Arrays;

class StatsCalculator {
    public static double[] calculateStats(double... args) {
        if (args.length == 0) {
            return new double[]{Double.NaN, Double.NaN, Double.NaN};
        }
        double max = Arrays.stream(args).max().orElse(0);
        double min = Arrays.stream(args).min().orElse(0);
        double avg = Arrays.stream(args).average().orElse(0);
        return new double[]{max, min, avg};
    }
}

// Пример использования
public class nom3 {
    public static void main(String[] args) {
        double[] stats = StatsCalculator.calculateStats(10.0, 5.0, 8.0, 12.0, 3.0);
        System.out.printf("Максимум: %.2f, Минимум: %.2f, Среднее: %.2f%n", stats[0], stats[1], stats[2]);
    }
}