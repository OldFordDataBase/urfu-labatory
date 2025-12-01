import java.util.Scanner;

public class timus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        int h = sc.nextInt();

        double time = (double) l / k * h;
        System.out.printf("%.7f %.7f\n", time, time);
    }
}
