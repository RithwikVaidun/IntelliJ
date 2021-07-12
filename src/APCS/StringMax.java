package APCS;

import java.util.Scanner;

public class StringMax {
    public static void getOrder(char[] s) {
        for (int i=0; i<s.length; i++ ) { //to find the highest ith item
            for (int j = 0; j < s.length - i - 1; j++) {
                if (s[j] > s[j+1]) {
                    char x = s[j];
                    s[j] = s[j+1];
                    s[j+1] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();

        char[] letters = new char[s.length()];
        for(int i = 0; i < s.length();i++) {
            letters[i] = s.charAt(i);
        }
        getOrder(letters);

        String ans = "";
        for(char c : letters) {
            ans += c;
        }
        char greatest = ans.charAt(ans.length() - 1);

        System.out.println("Enter string: max char:     " + greatest);
        System.out.println("in order:     " + ans);
    }
}
