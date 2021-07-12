package InOut;
import CardGames.*;
import java.util.Scanner;


public class InOut {
    static Deck deck = new Deck();
    static int pot = 0;
    static Player players[];
    static int turn;

    private static void collectPot() {
        for(int i = 0; i < players.length; i++) {
            players[i].removeMoney(2);
            pot += 2;
        }
    }

    private static void printTable() {
        System.out.println("Pot Amount: " + pot);
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        String names[] = {"Rithwik", "Dad"};
        Scanner inp = new Scanner(System.in);
        deck.shuffle();
        players = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i],100);
        }

        turn = 0;
        while (true) {
            Player p = players[turn];
            if (pot == 0) {
                collectPot();
            }
            printTable();
            Card left,right, middle;
            int lv, mv, rv;
            left = deck.getCard();
            lv = left.getValue();
            right = deck.getCard();
            rv = right.getValue();
            if (deck.remainingCards() <= 3) {
                deck.shuffle();
            }
            System.out.println(deck.remainingCards());
            System.out.println(left.getNumber() + "   " + right.getNumber());
            turn = (turn + 1) % players.length;

            if ((lv == 1 || rv == 1) || (Math.abs(lv-rv) < 2)) continue;
            System.out.println("Enter bet amount for " + p + ":");
            int betVal = inp.nextInt();
            if (betVal > 0) {
                if (betVal > pot) {
                    System.out.println("Bet reduced to pot max");
                    betVal = pot;
                }
                if (!p.removeMoney(betVal)) {
                    betVal = p.removeMoney();
                    System.out.println("Not enough balance, reduced bet to " + betVal);
                }
                middle = deck.getCard();
                mv = middle.getValue();
                System.out.println(middle.getNumber());
                if ((lv < mv && mv < rv) || (lv > mv && mv > rv)) {
                    pot -= betVal;
                    p.addMoney(betVal*2);
                    System.out.println("You win " + betVal * 2 + " dollars!");
                }
                else {
                    pot += betVal;
                    System.out.println("You lost " + betVal + " dollars.");
                }
            }

        }

    }
}
