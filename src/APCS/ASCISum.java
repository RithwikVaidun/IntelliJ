package APCS;

import java.util.Scanner;

public class ASCISum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int nWords = console.nextInt();
        console.nextLine();
        String[] words = new String[nWords];

        for(int i = 0; i < nWords; i++) {
            words[i] = console.nextLine();
        }

        int ans = 0;
        for (String word : words) { //for all the words
            for (int j = 0; j < word.length(); j++) { // for each word
                char x = word.charAt(j);
                ans += x;
            }
        }
        System.out.println(ans);

        
    }
}
