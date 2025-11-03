import java.util.Scanner;

public class num4_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        int i = start;
        while (i <= end) {
            System.out.print(i + " ");
            i++;
        }
    }
}
