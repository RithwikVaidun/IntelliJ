package APCS;

import java.util.Scanner;

public class calendar1 {
    static void printMonth(int startDay, int nDays) {
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        System.out.println("+------+------+------+------+------+------+------+");

        int d = 1;
        for (int r = 0;; r=1) {
            for (int c = 0; c < 7; c++) {
                if (((r == 0) && (c < (8 - startDay) % 7))  // spaces in the beginning
                        || (d > nDays)) { // spaces in the end
                    System.out.print("|      ");
                }
                else {
                    String s = (d < 10) ? " " : "";
                    System.out.print("|  " + s + d + "  ");
                    d++;
                }
            }
            System.out.println("|");
            if (d > nDays) break;
        }

        System.out.println("+------+------+------+------+------+------+------+");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int days = inp.nextInt();
        int st = inp.nextInt();
        System.out.print('\n');
        System.out.println("Please enter the number of days in the month: Please enter the number of the day of the first Sunday: ");
//        for (int sd = 1; sd <= 7; sd++) {
//            for(int j = 28; j <=31; j++) {
//                printMonth(sd,j);
//            }
//        }
        printMonth(st,days);


    }
}
