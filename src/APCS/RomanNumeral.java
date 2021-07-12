package APCS;

import java.util.Scanner;

public class RomanNumeral {
    public static String digToRom(int n, int pos) {
        String[] numerals = {"I", "V", "X", "L", "C", "D", "M"};
        String ans = "";

        if (n == 0) return ans;

        pos *= 2; // to adjust the starting position of numerals

        if ((n+1)%5 == 0)
            return numerals[pos]+numerals[pos+(n+1)/5];
        if (n >= 5)
            ans = numerals[pos+1];
        for (int i = 0; i < n % 5; i++) {
            ans += numerals[pos];
        }
        return ans;
    }

    public static String numToRoman(int n) {
        int place = 0;
        String ans = "";

        if (n >= 4000) return "Exceeds max number";

        for (int tmp = n; tmp > 0; tmp = tmp / 10, place++) {
            ans = digToRom(tmp % 10, place) + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String x = inp.nextLine();
        String[] splited = x.split(" ");
        int n = Integer.parseInt(splited[0]);
        int k = Integer.parseInt(splited[1]);
        System.out.print("enter two positive integers, smaller followed by larger: ");
        for(int i = n; i <= k; i++) {
            System.out.println(numToRoman(i));
        }



    }
}
