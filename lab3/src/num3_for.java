import java.util.Scanner;

public class num3_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int count = scanner.nextInt();

        long a = 1, b = 1;
        if (count >= 1) System.out.print(a + " ");
        if (count >= 2) System.out.print(b + " ");

        for (int i = 3; i <= count; i++) {
            long next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
