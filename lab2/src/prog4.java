import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        int num1;
        Scanner pe = new Scanner(System.in);
        num1 = pe.nextInt();
        if (num1 < 5){
            System.out.println("Число должно быть больше заявленного.");
        }else {

        }
        if (num1 > 10) {
            System.out.println("Число должно быть меньше заявленного.");
        }else {

        }
        if (num1 >= 5 && num1 <= 10) {
            System.out.println("Данное число входит в заданный диапозон.");
        }

    }
}
