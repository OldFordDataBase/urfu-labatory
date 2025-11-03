import java.util.Scanner;

public class num5_do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в сумме: ");
        int count = scanner.nextInt();

        int sum = 0;
        int num = 1;
        int i = 0;
        do {
            if (num % 5 == 2 || num % 3 == 1) {
                System.out.print(num + " ");
                sum += num;
                i++;
            }
            num++;
        } while (i < count);
        System.out.println("\nСумма: " + sum);
    }
}
