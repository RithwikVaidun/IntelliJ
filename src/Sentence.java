import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private String sentence;

    public Sentence(String s){
        sentence = s;
    }


    public ArrayList<Integer> getBlankPositions() {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                ans.add(i);
            }
        }
        return ans;
    }


    public int countWords() {
        int c = 1;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                c++;
            }
        }
        return c;
    }


    public String[] getWords() {
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
}