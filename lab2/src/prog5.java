import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner pe = new Scanner(System.in);
        long num1 = pe.nextLong();

        long num2 = (num1 / 1000) % 10;

        System.out.println("Кол-во тысяч в числе: " + num2);

    }
}
