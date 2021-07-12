package APCS;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        int x = 0;
        char y;
        char sq1 = '1';
        char sq2 = '2';
        char sq3 = '3';
        char sq4 = '4';
        char sq5 = '5';
        char sq6 = '6';
        char sq7 = '7';
        char sq8 = '8';
        char sq9 = '9';
        String p = "";
        printtable(sq1, sq2, sq3, sq4, sq5, sq6, sq7, sq8, sq9);
        while (x < 9) {
            y = x % 2 == 0 ? 'X' : 'O';
            if (x % 2 == 0){
                y = 'X';
                p = "Player 1";
            } else{
                y = 'O';
                p = "Player 2";
            }
            System.out.println(p + "'s turn. Please enter a number");
            int w = getValidNumber(sq1, sq2, sq3, sq4, sq5, sq6, sq7, sq8, sq9, pen);
            switch (w) {
                case 1:
                    sq1 = y;
                    break;
                case 2:
                    sq2 = y;
                    break;
                case 3:
                    sq3 = y;
                    break;
                case 4:
                    sq4 = y;
                    break;
                case 5:
                    sq5 = y;
                    break;
                case 6:
                    sq6 = y;
                    break;
                case 7:
                    sq7 = y;
                    break;
                case 8:
                    sq8 = y;
                    break;
                case 9:
                    sq9 = y;
                    break;
                default:
                    System.out.println("Enter a valid number");
                    continue;
            }
            printtable(sq1, sq2, sq3, sq4, sq5, sq6, sq7, sq8, sq9);
            if(winCondition(sq1, sq2, sq3, sq4, sq5, sq6, sq7, sq8, sq9)){
                System.out.println(p + " won!");
                return;
            }
            x++;
        }
        System.out.println("Tie");


    }

    public static void printtable(char sq1, char sq2, char sq3, char sq4, char sq5, char sq6, char sq7, char sq8, char sq9) {
        System.out.println(sq1 + " | " + sq2 + " | " + sq3);
        System.out.println("--+---+--");
        System.out.println(sq4 + " | " + sq5 + " | " + sq6);
        System.out.println("--+---+--");
        System.out.println(sq7 + " | " + sq8 + " | " + sq9);
    }

    public static int getValidNumber(char sq1, char sq2, char sq3, char sq4, char sq5, char sq6, char sq7, char sq8, char sq9, Scanner pen) {
        while (true) {
            int x = pen.nextInt();
            switch (x) {
                case 1:
                    if (sq1 == '1') {
                        return x;


                    } else {
                        System.out.println("Enter another number");
                        continue;
                    }
                case 2:
                    if (sq2 == '2') {
                        return x;

                    } else {
                        System.out.println("Enter another number");
                        continue;
                    }
                case 3:
                    if (sq3 == '3') {
                        return x;

                    } else {
                        System.out.println("Enter another number");
                        continue;
                    }
                case 4:
                    if (sq4 == '4') {
                        return x;
                    } else {
                        System.out.println("Enter another number");
                        continue;
                    }
                case 5:
                    if (sq5 == '5') {
                        return x;

                    } else {
                        System.out.println("Enter another number");
                        continue;
                    }
                case 6:
                    if (sq6 == '6') {
                        return x;

                    } else {
                        System.out.println("Enter another number");
                        continue;
                    }
                case 7:
                    if (sq7 == '7') {
                        return x;

                    } else {
                        System.out.println("Enter another number");
                        continue;
                    }
                case 8:
                    if (sq8 == '8') {
                        return x;

                    } else {
                        System.out.println("Enter another number");
                        continue;
                    }
                case 9:
                    if (sq9 == '9') {
                        return x;

                    } else {

                        System.out.println("Enter another number");
                    }
            }
        }
    }
    public static boolean winCondition(char sq1, char sq2, char sq3, char sq4, char sq5, char sq6, char sq7, char sq8, char sq9){
        if ((sq1 == sq2  && sq2 == sq3)||
                (sq4 == sq5  && sq5 == sq6)||
                (sq7 == sq8  && sq8 == sq9)||
                (sq1 == sq4  && sq4 == sq7)||
                (sq2 == sq5  && sq5 == sq8)||
                (sq3 == sq6  && sq6 == sq9)||
                (sq1 == sq5  && sq5 == sq9)||
                (sq3 == sq5  && sq5 == sq7)){
            return true;
        }
        return false;
    }
}
