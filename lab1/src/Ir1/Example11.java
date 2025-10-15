package Ir1;

import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {

        Scanner pe = new Scanner(System.in);
        String pe1;
        int pe2,pe3;
        pe3 = 2025;

        System.out.print("Введите ваше Имя: ");
        pe1 = pe.nextLine();
        System.out.print("Введите ваш год рождения: ");
        pe2 = pe.nextInt();
        int res = pe3 - pe2;
        System.out.println("Ваше имя: " + pe1 + " и вам:  " + res + " лет");


    }
}
