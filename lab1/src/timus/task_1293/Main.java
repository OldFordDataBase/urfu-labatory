package timus.task_1293;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner pe = new Scanner(System.in);
        long N,A,B,res;
        System.out.print("Введите N: ");
        N = pe.nextLong();
        System.out.print("Введите A: ");
        A = pe.nextLong();
        System.out.print("Введите B: ");
        B = pe.nextLong();

        res = N * A * B * 2;

        System.out.println("Результат: " + res);

    }
}
