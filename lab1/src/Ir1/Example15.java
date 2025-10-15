package Ir1;

import java.util.Scanner;

public class Example15 {

    public static void main(String[] args) {

        Scanner pe = new Scanner(System.in);
        int pe1,pe2,res,res2;
        System.out.print("Введите 1 число: ");
        pe1 = pe.nextInt();
        System.out.print("Введите 2 число: ");
        pe2 = pe.nextInt();
        res = pe1 + pe2;
        res2 = pe1 - pe2;

        System.out.println("Ваша сумма двух чисел: " + res + " А разность: " + res2);


    }
}
