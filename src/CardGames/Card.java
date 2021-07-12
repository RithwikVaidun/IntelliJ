package CardGames;

import java.util.Objects;

public class Card {
    String suit;
    String number;
    int value;


    public Card(String s, String n, int v) {
        suit = s;
        number = n;
        value = v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value &&
                Objects.equals(suit, card.suit) &&
                Objects.equals(number, card.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, number, value);
    }
    public String toString() {
        return suit + number;
    }

    public int getValue() {
        return value;
    }

    public String getNumber() {
        return number;
    }
}