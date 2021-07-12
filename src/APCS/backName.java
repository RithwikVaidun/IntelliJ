package APCS;

import java.util.Scanner;

public class backName {
    public static void processName(Scanner x) {
        System.out.println("Enter name");
        String y = x.nextLine();
        String[] z = y.split(" ");
        String first = z[0];
        String last = z[1];
        System.out.println(last + ", " + first);

    }
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        processName(f);
    }
}
