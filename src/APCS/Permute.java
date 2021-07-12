package APCS;

import java.util.Scanner;
import java.util.TreeSet;

public class Permute {
    static TreeSet<String> combo = new TreeSet<>();

    public static void main(String[] args) {
        System.out.println("Input string: ");
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        permutate("", s);
        print();
    }

    private static void permutate(String prefix, String s) {
        int l = s.length();
        if (l == 0) combo.add(prefix);
        else {
            for (int i = 0; i < l; i++) {
                String p = prefix + s.charAt(i);
                String x = s.substring(0, i) + s.substring(i + 1, l);
                permutate(p, x);
            }
        }
    }

    private static void print() {
        for (String string : combo) {
            System.out.println(string);
        }
    }
}
