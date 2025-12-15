class SumOfSquares {
    public static int sumSquaresFormula(int n) {
        if (n < 1) return 0;
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static int sumSquaresLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}

// Пример использования
public class nom5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("По формуле: " + SumOfSquares.sumSquaresFormula(n)); // 55
        System.out.println("Циклом: " + SumOfSquares.sumSquaresLoop(n));       // 55
    }
}