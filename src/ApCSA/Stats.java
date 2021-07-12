package ApCSA;

import java.util.ArrayList;

public class Stats {
    private ArrayList<ScoreInfo> scoreList;

    public boolean record(int score) {
        for(int i = 0; i < scoreList.size(); i++) {
            if(score < scoreList.get(i).getScore()) { //if score you want to record is less than score of checl
                scoreList.add(i, new ScoreInfo(score));
                return true;
            }
            else if (score == scoreList.get(i).getScore()) {
                scoreList.get(i).increase();
                return false;
            }
        }
        scoreList.add(new ScoreInfo(score));
        return true;
    }



    public void recordScores(int[] stuScores) {
        for(int i : stuScores) {
            record(i);
        }

    }
}
