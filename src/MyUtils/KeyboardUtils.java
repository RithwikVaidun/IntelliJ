package MyUtils;

import java.util.Scanner;

public class KeyboardUtils {

    public static String shift(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            ans = ans + ((char)(((s.charAt(i) + 1) - 97) % 26 + 97));
        }

        return ans;
    }


    public static int getNumber(Scanner inp, int min, int max) {
        int num;
        while (true) {
            if (inp.hasNextInt()) {
                num = inp.nextInt();
                if(min <= num && num <= max) {
                    break;
                }
                else {
                    System.out.println("Please enter a number between " + min + " and " + max);
                }
            }
            else {
                inp.next();
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return num;
    }

    public static String getChoice(Scanner inp, String choices) {
        while (true) {
            System.out.println("Pick a choice:" + choices);
            try {
                String ch = inp.next(choices);
                return ch;
            }catch (java.util.InputMismatchException e) {
                inp.next();
            }
        }
    }

    public static String getChoice(Scanner inp, String choices,String name) {
        while (true) {
            System.out.println(name + ",Pick a choice:" + choices);
            try {
                String ch = inp.next(choices);
                return ch;
            }catch (java.util.InputMismatchException e) {
                inp.next();
            }
        }
    }

    public static String getChoice(Scanner keyboard,String prompt, String a, String b){
        System.out.println(prompt);
        String ret;
        while(true){
            ret = keyboard.next();
            if(ret.equals(a) || ret.equals(b)){
                break;
            }
            else{
                System.out.println("Please enter only left or right");
            }
        }
        return ret;
    }
}
