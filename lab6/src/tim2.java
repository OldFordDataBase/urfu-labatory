import java.util.*;

public class tim2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        long[] a = new long[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextLong();
        }

        // Сумма всех требований
        long sumA = 0;
        for (long x : a) {
            sumA += x;
        }

        // Если сумма требований больше населения — невозможно
        if (sumA > n) {
            System.out.println(0);
            return;
        }

        // Минимальное количество, говорящих на всех k диалектах
        long minAll = Math.max(0, sumA - n);

        System.out.println(minAll);
    }
}