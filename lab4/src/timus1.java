import java.util.Scanner;
import java.math.BigInteger;

public class timus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nStr = scanner.next();

        BigInteger n = new BigInteger(nStr);

        // Нам нужно найти N mod 3
        BigInteger three = new BigInteger("3");
        int remainder = n.mod(three).intValue();

        if (remainder == 0) {
            // N mod 3 == 0. Это проигрышная позиция. Игрок 2 выигрывает.
            System.out.println(2);
        } else if (remainder == 1) {
            // N mod 3 == 1. Выигрышная позиция.
            System.out.println(1);
            System.out.println(1);
        } else { // remainder == 2
            // N mod 3 == 2. Выигрышная позиция.
            System.out.println(1);
            System.out.println(2);
        }

        scanner.close();
    }
}