import java.util.*;

public class timus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] grille = new char[4][4];
        char[][] square = new char[4][4];

        for (int i = 0; i < 4; i++) {
            grille[i] = sc.nextLine().toCharArray();
        }
        for (int i = 0; i < 4; i++) {
            square[i] = sc.nextLine().toCharArray();
        }

        StringBuilder password = new StringBuilder();

        for (int rot = 0; rot < 4; rot++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (grille[i][j] == 'X') {
                        password.append(square[i][j]);
                    }
                }
            }
            grille = rotate(grille);
        }

        System.out.println(password);
    }

    static char[][] rotate(char[][] grid) {
        char[][] res = new char[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                res[j][3 - i] = grid[i][j];
        return res;
    }
}
