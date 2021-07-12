package APCS;

import java.util.Scanner;

public class Fencepost {
    public static void printLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            if(i == text.length()-1)
                System.out.print(text.charAt(i));
            else
                System.out.print(text.charAt(i) + "..");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String x = inp.next();
        printLetters(x);

    }
}
