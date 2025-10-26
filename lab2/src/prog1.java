import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        Scanner pe = new Scanner(System.in);
        int num1 = pe.nextInt();
        int res = num1 % 3;
        if (res == 0)
            System.out.println("Число делится на 3");
        else
            System.out.println("Число не делится на 3");
    }
}
