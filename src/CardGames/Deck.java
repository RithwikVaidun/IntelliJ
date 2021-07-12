package CardGames;

import java.util.Random;
import java.util.*;
public class Deck {
    public Card[] cards = new Card[52];
    public int top;

    public Deck() {
        top = 0;
        String suits[] = {"S", "H", "D", "C"};
        String num[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int i = 0;
        for (String s : suits) {
            for (int n = 0; n < num.length; n++) {
                cards[i++] = new Card(s, num[n], n + 1);
            }
        }
    }

    public void print() {
        for (int i = top; i < cards.length; i++) {
            System.out.println(cards[i].toString());
        }
    }

    public void shuffle() {
        Random rand = new Random();
        int count = rand.nextInt(5);
        while (count-- != 0) {
            for (int i = 0; i < cards.length; i++) {
                int r = rand.nextInt(cards.length);
                Card t = cards[i];
                cards[i] = cards[r];
                cards[r] = t;
            }
        }
        top = 0;
    }

    public Card getCard() {
        if (top == cards.length) {
            shuffle();
        }
        return cards[top++];
    }

    public int remainingCards() {
        return cards.length - top;
    }

    public void setTops(Card c,Card c1) {
        cards[top] = c;
        cards[top+1] = c1;

    }



}
