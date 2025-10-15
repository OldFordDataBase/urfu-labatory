package Ir1;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) {

        Scanner pe = new Scanner(System.in);
        int pe1,res1,res2,res3,res4;
        System.out.print("Введите число: ");
        pe1 = pe.nextInt();
        res1 = pe1 - 1;
        res2 = pe1 + 1;
        res3 = res1 + res2 + pe1;
        res4 = res3 * res3;


        System.out.println(res1 + " " + pe1 + " " + res2 + " " + res4);


    }
}
