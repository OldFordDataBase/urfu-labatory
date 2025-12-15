import java.io.*;
import java.util.*;

public class tim1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        if (n == 1) {
            System.out.println(a[0]);
            return;
        }
        if (n == 2) {
            System.out.println(Math.max(a[0], a[1]));
            return;
        }

        int minTotal = Integer.MAX_VALUE;

        // Случай 1: Не стреляем по первому балкончику (a[0] = 0)
        int[] b1 = a.clone();
        b1[0] = 0;
        minTotal = Math.min(minTotal, solveLinear(b1));

        // Случай 2: Не стреляем по последнему балкончику (a[n-1] = 0)
        int[] b2 = a.clone();
        b2[n - 1] = 0;
        minTotal = Math.min(minTotal, solveLinear(b2));

        System.out.println(minTotal);
    }

    private static int solveLinear(int[] a) {
        int n = a.length;
        if (n == 0) return 0;
        if (n == 1) return a[0];
        if (n == 2) return Math.max(a[0], a[1]);

        int[] b = a.clone();
        int totalShots = 0;

        for (int i = 0; i < n - 2; i++) {
            if (b[i] > 0) {
                int shots = b[i];
                totalShots += shots;
                b[i] -= shots;
                b[i + 1] -= shots;
                b[i + 2] -= shots;
            }
        }

        if (b[n - 2] > 0) {
            int shots = b[n - 2];
            totalShots += shots;
            b[n - 2] -= shots;
            b[n - 1] -= shots;
        }

        if (b[n - 1] > 0) {
            totalShots += b[n - 1];
        }

        return totalShots;
    }
}