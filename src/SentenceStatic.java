import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SentenceStatic {
    public static String sentence;

    public static ArrayList<Integer> getBlankPositions() {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                ans.add(i);
            }
        }
        return ans;
    }


    public static int countWords() {
        int c = 1;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                c++;
            }
        }
        return c;
    }


    public static String[] getWords() {
        String[] ans = new String[countWords()];
        ArrayList<Integer> spaces = getBlankPositions();
        int start = 0;
        if(ans.length == 1){
            ans[0] = sentence;
            return ans;
        }
        for(int i = 0; i < ans.length; i++){
            if(i == ans.length - 1){
                ans[i] = sentence.substring(spaces.get(i - 1) + 1);
                break;
            }
            ans[i] = sentence.substring(start, spaces.get(i));
            start = spaces.get(i) + 1;
        }
        return ans;
        }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sentence = inp.nextLine();
        System.out.println(getBlankPositions());
        System.out.println(countWords());

        String[] words = getWords();
        System.out.print("{");
        for(int i = 0; i < words.length;i++){

            if(i == words.length-1){
                System.out.print(words[i]);
            }
            else{
                System.out.print(words[i] + ", ");
            }

        }
        System.out.println("}");
    }
}
