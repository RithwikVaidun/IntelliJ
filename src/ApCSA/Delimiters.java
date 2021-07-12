package ApCSA;

import java.util.ArrayList;

public class Delimiters {

    private String openD;
    private String closeD;

    public Delimiters(String open, String close) {
        openD = open;
        closeD = close;
    }

    public String getCloseD() {
        return closeD;
    }

    public String getOpenD() {
        return openD;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i<tokens.length; i++) {
            if(tokens[i].equals(openD) || tokens[i].equals(closeD)) {
                ans.add(tokens[i]);
            }
        }
        return ans;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        int closeCount = 0;
        for(int i = 0; i<delimiters.size(); i++) {
            if(delimiters.get(i).equals(openD)) {
                openCount++;
            } else if(delimiters.get(i).equals(closeD)) {
                closeCount++;
            }
        }
        return openCount == closeCount;

    }
}
