package ApCSA;

import java.util.List;

public class letters {
    public static int totalLetters(List<String> wordList) {
        int x = 0;
        for(int i = 0; i< wordList.size(); i++) {
           x += wordList.get(i).length();
        }
        return x;
    }
}
