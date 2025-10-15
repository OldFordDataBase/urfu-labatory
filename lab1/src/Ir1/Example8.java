package Ir1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

        Scanner pe = new Scanner(System.in);
        String pe1,pe2,pe3;
        System.out.print("Введите сегодняшний день недели: ");
        pe1 = pe.nextLine();
        System.out.print("Введите название сегодняшнего месяца: ");
        pe2 = pe.nextLine();
        System.out.print("Введите сегодняшнюю дату месяца: ");
        pe3 = pe.nextLine();
        System.out.println("Сегодня: " + pe1 + " " + pe3 + " " + pe2);


    }
}
