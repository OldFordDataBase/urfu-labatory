import java.util.Scanner;

public class timus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int garry = scanner.nextInt();
        int larry = scanner.nextInt();

        // Банки, не простреленные Гарри: только Ларри
        int notGarry = larry - 1;

        // Банки, не простреленные Ларри: только Гарри
        int notLarry = garry - 1;

        System.out.println(notGarry + " " + notLarry);
    }
}
