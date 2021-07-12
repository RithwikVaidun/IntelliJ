package APCS;

public class EternalDice {
    // Number of games played before third player wins
    public static int countGamesPlayedBeforeWonBy(int p){
        int games = 0;
        int player = 0;
        while(true) {
            int rand = (int)(Math.random() * 6) + 1;
            if (rand == 6) {
                games++;
                if (player == p)  break;
            }
            player = (player + 1) % 3;
        }
        return games;
    }

    public static void main(String[] args) {
        long numTimes = 1000000;
        int totalGamesPlayed = 0;

        for(long i = 0; i < numTimes; i++){
            totalGamesPlayed += countGamesPlayedBeforeWonBy(2);
        }

        System.out.println();
        System.out.println("Number of times won by player D = " + numTimes + " of " + totalGamesPlayed + " games played. Probability = " + (double) numTimes/ totalGamesPlayed);

    }
}
