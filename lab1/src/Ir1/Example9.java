package Ir1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {

        Scanner pe = new Scanner(System.in);
        String pe1,pe2;
        System.out.print("Введите название месяца: ");
        pe1 = pe.nextLine();
        System.out.print("Введите кол-во дней в данном месяце: ");
        pe2 = pe.nextLine();
        System.out.println("Месяц: " + pe1 + " содержит:  " + pe2 + " Дней");


    }
}
