import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner pe = new Scanner(System.in);
        int num1, num2, res, res2;
        boolean t1, t2;
        num1 = pe.nextInt();
        res = num1 % 4;
        res2 = num1 % 7;

        if (num1 < 10) {
            System.out.println("Число меньше 10");
            t2 = false;
        } else {
            System.out.println("Число больше 10");
            t2 = true;
        }


        if (res == 0) {
            System.out.println("Остаток при делении на 4 = 0");
            t1 = true;
        }
        else {
            System.out.println("Остаток при делении на 4 = " + res );
            t1 = false;
        }

        if (t1 == true && t2 == true) {
            System.out.println("Число удволетварено.");
        } else {
            System.out.println("Число неудволетворено условию.");
        }



    }


}
