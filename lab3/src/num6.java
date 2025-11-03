import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        try {
            int size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Некорректное значение: размер должен быть положительным");
                return;
            }

            int[] array = new int[size];
            int num = 2; // Первое число с %5==2
            for (int i = 0; i < size; i++) {
                array[i] = num;
                num += 5;
            }

            System.out.print("Массив: ");
            for (int value : array) {
                System.out.print(value + " ");
            }
        } catch (Exception e) {
            System.out.println("Некорректное значение: введите целое число");
        }
    }
}
