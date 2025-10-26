import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner pe = new Scanner(System.in);
        int num1,num2,res,res2;
        boolean t1,t2;
        num1 = pe.nextInt();
        res = num1 % 5;
        res2 = num1 % 7;
        if (res == 2) {
            System.out.println("Остаток при делении на 5 = 2");
            t1 = true;
        }
        else {
            System.out.println("Остаток при делении на 5 = " + res );
            t1 = false;
        }
        if (res2 == 1) {
            System.out.println("Остаток при делении на 7 = 1");
            t2 = true;
        }else {
            System.out.println("Остаток при делении на 7 = " + res2);
            t2 = false;
        }
        if (t1 == true && t2 == true){
            System.out.println("Число удволетварено.");
        }else {
            System.out.println("Число неудволетворено условию.");
        }


    }
}
