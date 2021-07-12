package APCS;

import java.util.Scanner;

public class StairsUsersSize {

    public static void printSpaces(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public static void printEnd() {
        System.out.println("*");
    }

    public static void printStep(int spaces1,int spaces2) {
        printSpaces(spaces1);
        System.out.print("O  ******");
        printSpaces(spaces2);
        printEnd();



        printSpaces(spaces1 -1);
        System.out.print("/|\\ *");
        printSpaces(spaces2+5);
        printEnd();


        printSpaces(spaces1 -1);
        System.out.print("/ \\ *");
        printSpaces(spaces2 +5);
        printEnd();

    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("enter TOTAL_STAIRS: ");
        int s = console.nextInt();
        System.out.println();

        int spaces1 = 5*s -3;
        int spaces2 = 0;
        for(int i = 0; i < s; i++) {
            printStep(spaces1,spaces2);
            spaces1 = spaces1 - 5;
            spaces2 = spaces2 + 5;
        }

        int last = 5*s +7;
        for(int i = 0; i < last; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

