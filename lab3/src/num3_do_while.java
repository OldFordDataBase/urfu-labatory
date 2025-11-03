import java.util.Scanner;

public class num3_do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int count = scanner.nextInt();

        long a = 1, b = 1;
        int i = 1;
        do {
            if (i == 1) {
                System.out.print(a + " ");
            } else if (i == 2) {
                System.out.print(b + " ");
            } else {
                long next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
            i++;
        } while (i <= count);
    }
}

