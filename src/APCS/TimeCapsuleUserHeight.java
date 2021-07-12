package APCS;

import java.util.Scanner;

    public class TimeCapsuleUserHeight {
        public static int h;

        public static void topCone() {
            int spaces = h;
            for(int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            System.out.println("*");

            int x = 1;
            for(int i = 0; i < h; i++) { //for each line
                for(int k = 0; k < spaces-1; k++) {
                    System.out.print(" ");
                }
                System.out.print("/");
                for(int j = 0; j < x; j++ ) { //number of o's
                    System.out.print("o");
                }
                x += 2;
                System.out.println("\\");
                spaces--;
            }
        }

        public static void box() {
            int loop = (2*h) - 1;

            for(int i = 0; i < loop; i++) { // for each line
                System.out.print("|");

                for(int k = 0; k < loop; k++) { // for contents of each line number of chars betweens |
                    if(i == 0 || i == loop-1) {
                        System.out.print("@");
                    }
                    else {
                        System.out.print("@");

                        for (int t = 0; t < loop - 2; t++) {
                            System.out.print(" ");
                        }
                        System.out.print("@");
                        break;
                    }

                }
                System.out.println("|");
            }
        }

        public static void bottomCone() {
            int spaces = 0;
            int loop = 2*h -1;
            for(int i = 0; i < h; i++) { // for each line

                for(int k = 0; k < spaces; k++) {
                    System.out.print(" ");
                }
                System.out.print("\\");

                for(int r = 0; r < loop; r++) {
                    System.out.print("o");
                }
                System.out.println("/");
                spaces++;
                loop -= 2;
            }
            for(int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            System.out.println("*");


        }

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("enter HEIGHT: ");    // prompt for user
            h = inp.nextInt();                // get HEIGHT from user
            System.out.println();
            topCone();
            box();
            bottomCone();
        }
    }

