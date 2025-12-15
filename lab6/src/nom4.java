class DoubleFactorial {
    public static long doubleFactorial(int n) {
        if (n <= 0) return 1;
        long result = 1;
        while (n > 0) {
            result *= n;
            n -= 2;
        }
        return result;
    }
}

// Пример использования
public class nom4 {
    public static void main(String[] args) {
        System.out.println(DoubleFactorial.doubleFactorial(6)); // 48
        System.out.println(DoubleFactorial.doubleFactorial(5)); // 15
    }
}