package CardGames;

public class Player {
    String name;
    int balance;
    Card cards[];


    public Player (String n, int b) {
        name = n;
        balance = b;
    }

    public Player(String n, int b, int nc) {
        name = n;
        balance = b;
        cards = new Card[nc];
        for (int i = 0; i < nc; i++) {
            cards[i] = null;
        }
    }

    public int addMoney (int n) {
        if(n>0) {
            balance += n;
        }
        return balance;
    }

    public boolean removeMoney (int n) {
        if(n <= balance) {
            balance -= n;
            return true;
        }
        return false;
    }

    public int removeMoney() {
        int b = balance;
        balance = 0;
        return b;
    }

    public void addCard(Card c) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                cards[i] = c;
                break;
            }
        }
    }

    public void removeCards() {
        for (int i = 0; i < cards.length; i++) {
            cards[i] = null;
        }
    }

    public void removeCard(Card c) {
        for(int i = 0; i < cards.length; i++) {
            if (c.equals(cards[i])) {
                cards[i] = null;
            }
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public int getCardCount() {
        return cards.length;
    }

    public boolean hasBalance() {
        return (balance > 0);
    }

    public int getBalance(){
        return balance;
    }

    public String toString() {
        return name + ((balance != -1) ? "(" + balance + ")" : "");
    }

    public String getName() {
        return name;
    }

}
