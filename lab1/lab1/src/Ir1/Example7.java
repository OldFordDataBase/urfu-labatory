package Ir1;

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {

        Scanner pe = new Scanner(System.in);
        String pe1,pe2;
        System.out.print("Введите вашу Имя: ");
        pe1 = pe.nextLine();
        System.out.print("Введите ваше Возраст: ");
        pe2 = pe.nextLine();
        System.out.println("Вас зовут: " + pe1 + " " + "; и вам: " + pe2 + " лет.");


    }
}
