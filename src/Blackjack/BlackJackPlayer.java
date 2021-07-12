package Blackjack;
import CardGames.Card;
import CardGames.Player;

import java.util.ArrayList;
import java.util.Scanner;

import static MyUtils.KeyboardUtils.getChoice;
import static Blackjack.Blackjack.calcHandValue;

public class BlackJackPlayer extends Player {
    ArrayList<ArrayList<Card>> hands;
    Scanner inp;
    int currentH = 0;

    public BlackJackPlayer(Scanner inp, String n, int b) {
        super(n, b);
        hands = new ArrayList<>();
        hands.add(new ArrayList<>());
        this.inp = inp;
    }
    public static void prompt(boolean split){
        System.out.println("h = HIT");
        System.out.println("s = STAND");
        if(split) System.out.println("S = SPLIT");

    }

    public String act() {
        String choices = "hs";
        ArrayList<Card> curr = hands.get(currentH); //1st hand / current hand

        if(calcHandValue(curr,false) == 21)
            return "bj";

        if(hands.get(currentH).size() >= 2 && curr.get(0).getNumber().equals(curr.get(1).getNumber())){
            choices += "S";
        }
        prompt(choices.contains("S"));

        choices = "[" + choices + "]";


        return getChoice(inp,choices,getName());
    }

    public void addCard(Card c) {
        hands.get(currentH).add(c);
    }

    public ArrayList<ArrayList<Card>> getHands() {
        return hands;
    }

    public void splitH() {
        Card c = hands.get(currentH).get(0);
        hands.add(new ArrayList<>());
        hands.get(currentH+1).add(c);
        hands.get(currentH).remove(0);
    }

    public void clearHands() {
        for(int i = 0; i < hands.size(); i++){
            hands.get(i).clear();
        }
    }


}
