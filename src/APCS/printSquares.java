package APCS;

import java.util.ArrayList;
import java.util.Scanner;

public class printSquares {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("positive integer: ");

        int x = inp.nextInt();
        printSquares(x);
    }

    static void printSquares(int n) {
        if (n == 0)
            return;
        solve(new ArrayList<>(), n, 1);
    }

    static void solve(ArrayList<Integer> list, int n, int z) {
        int to = (int) Math.sqrt(n);
        if (n == 0) {
            System.out.println("unique bases: " + list);
            remove(list);
            return;
        }
        int i = z;
        while(i <= to) {
            list.add(i);
            solve(list, (int) (n-Math.pow(i, 2)), ++i);
        }

        if (!(list.size() == 0))
            remove(list);
    }

    static void remove(ArrayList<Integer> x) {
        x.remove(x.size() - 1);
    }
}
