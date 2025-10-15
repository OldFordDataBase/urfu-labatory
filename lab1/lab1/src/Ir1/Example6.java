package Ir1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner pe = new Scanner(System.in);
        String pe1,pe2,pe3;
        System.out.print("Введите вашу Фамилию: ");
        pe1 = pe.nextLine();
        System.out.print("Введите ваше Имя: ");
        pe2 = pe.nextLine();
        System.out.print("Введите ваше Отчество: ");
        pe3 = pe.nextLine();
        System.out.println("Hello " + pe1 + " " + pe2 + " " + pe3);


    }
}
