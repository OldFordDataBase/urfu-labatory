package Ir1;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        System.out.print("Введите ваш рост: ");
        float height = in.nextFloat();

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        in.close();

    }
}
