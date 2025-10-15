package Ir1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        Scanner pe = new Scanner(System.in);
        int pe1,pe2;
        pe2 = 2025;
        System.out.print("Введите ваш год рождения: ");
        pe1 = pe.nextInt();
        int res = pe2 - pe1;

        System.out.println("Ваш возраст: " + res);


    }

}
