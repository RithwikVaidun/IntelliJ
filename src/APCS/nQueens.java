package APCS;

import java.util.Arrays;

public class nQueens {
    public static final int n = 10; //input

    public static void Solution(char[][] x) { // recursion method
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(x[i]).replaceAll(",", "")); //output
        }
        System.out.println();
    }

    public static boolean isSafe(char x[][], int y, int z) { //check if piece is safe
        for (int i = 0; i < y; i++) {
            if (x[i][z] == 'Q')
                return false;
        }

        for (int i = y, j = z; i >= 0 && j >= 0; i--, j--) {
            if (x[i][j] == 'Q')
                return false;
        }

        for (int i = y, j = z; i >= 0 && j < n; i--, j++) {
            if (x[i][j] == 'Q')
                return false;
        }

        return true;
    }

    private static void solve(char x[][], int y) { //solves problem
        if (y == n) {
            Solution(x);
            return;
        }


        for (int i = 0; i < n; i++) {
            if (isSafe(x, y, i)) {
                x[y][i] = 'Q';

                solve(x, y + 1);

                x[y][i] = '–';
            }
        }
    }

    public static void main(String[] args) {

        char[][] x = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(x[i], '–');
        }

        solve(x, 0);
    }
}
