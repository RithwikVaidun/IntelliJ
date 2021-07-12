package Blackjack;
import CardGames.*;

import java.util.ArrayList;
import java.util.Scanner;

import static MyUtils.KeyboardUtils.getNumber;

public class Blackjack {
    static BlackJackPlayer[] players;

    public static int calcHandValue(ArrayList<Card> c, boolean dealer) {
        int total = 0;
        boolean hasAces = false;
        for (int i = 0; i < c.size() && c.get(i) != null; i++) {
            int v = c.get(i).getValue();
            if (v > 10)
                v = 10;
            if (dealer && i == 0) continue;
            if (v == 1) {
                hasAces = true;
            }
            total += v;
        }
        if (hasAces && total < 12) {
            total += 10;
        }
        return total;
    }

    public static String getNBC(BlackJackPlayer p, boolean dealer) {
        String str = p.getName() + "(" + p.getBalance() + ")";
        ArrayList<ArrayList<Card>> h = p.getHands();

        for (ArrayList<Card> c : h) { //for each hand
            int cn = 0;
            for (Card card : c) {//for each card in the hand
                if(dealer && cn == 0) {
                    str += " XX";
                }
                else str += " " + card.toString();
                cn++;
            }

            str += " [" + calcHandValue(c, dealer) + "]";
        }

        return str;
    }

    public static void showTable(boolean hideDealer) {
        for (int i = 0; i < players.length; i++) {
            System.out.println(getNBC(players[i], hideDealer && (i == players.length - 1)));
        }
    }



    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        Scanner inp = new Scanner(System.in);
        int[] bets;
        //Play game

        /*System.out.println("How many players are there?");
        int playNum = getNumber(inp,1,100) +1;
        bets = new int[playNum];
        players = new BlackJackPlayer[playNum];

        for(int i = 0; i < playNum - 1; i++) {
            System.out.println("Enter player " + (i+1));
            String names = inp.next();
            players[i] = new BlackJackPlayer(inp,names,100);
        }
        players[playNum - 1] = new BlackJackPlayer(inp,"Dealer",0);*/

        //2 player test

        bets = new int[3];
        players = new BlackJackPlayer[3];

        players[0] = new BlackJackPlayer(inp,"Rithwik",100);
        players[1] = new BlackJackPlayer(inp, "Rahul",100);
        players[2] = new BlackJackPlayer(inp,"Dealer",0);

        while (true) { //for each round
            d.shuffle();
            for (int i = 0; i < players.length - 1; i++) {
                System.out.println(players[i] + ", How much do you want to bet?");
                bets[i] = getNumber(inp, 1, players[i].getBalance());
                players[i].removeMoney(bets[i]);
            }

            for (BlackJackPlayer p : players) {
                for(int i = 0; i < 2; i++) {
                    p.addCard(d.getCard());
                }
            }
            //Split Test
            players[0].clearHands();
            players[0].addCard(new Card("H","5",5));
            players[0].addCard(new Card("S","5",5));

            BlackJackPlayer p;
            int turn;

            for (turn = 0; turn < players.length - 1;) { // for each player
                p = players[turn];
                showTable(true);
                System.out.println();
                int currentH = p.currentH;

                for (int i = 0; i < p.hands.size(); i++) {//for each hand
                    while (true) { //keep hitting until bust or stand
                        String act = p.act();

                        if(act.equals("bj")) {
                            System.out.println("Blackjack!");
                            turn++;
                            break;
                        }

                        if (act.equals("h")) {
                            Card c = d.getCard();
                            p.addCard(c);
                            System.out.println(p.getName() + " got a " + c);
                            showTable(true);
                            if (calcHandValue(p.getHands().get(currentH), false) == 21) {
                                System.out.println("Blackjack!");
                                System.out.println();
                                turn++;
                                break;
                            }

                            if (calcHandValue(p.getHands().get(currentH), false) > 21) {
                                System.out.println("Bust!");
                                System.out.println();
                                bets[turn] = 0;
                                turn++;
                                break;
                            }

                        } else if (act.equals("s") && i == p.hands.size()-1) {
                            turn++;
                            break;
                        }

                        else if(act.equals("s")){
                            p.currentH++;
                        }

                        else if (act.equals("S")) {
                            p.splitH();
                            showTable(true);
                            i--;
                            break;
                        }
                    }
                }
            }

            //BlackJackPlayer dealer = players[playNum-1];
            BlackJackPlayer dealer = players[2];
            int dealerVal;

            while ((dealerVal = calcHandValue(dealer.getHands().get(0),false)) < 17) {
                dealer.addCard(d.getCard());
            }

            showTable(false);

            if (dealerVal > 21) {
                for (int i = 0; i < players.length - 1; i++) {
                    if (bets[i] > 0) {
                        players[i].addMoney(2 * bets[i]);
                        System.out.println(players[i].getName() + " won " + 2 * bets[i] + " dollars!");
                    }
                }
            } else {
                for (int i = 0; i < players.length - 1; i++) {
                    if (bets[i] != 0 && calcHandValue(players[i].getHands().get(0), false) > dealerVal && calcHandValue(players[i].getHands().get(0), false) != dealerVal) {
                        players[i].addMoney(2 * bets[i]);
                        System.out.println(players[i].getName()+ " won " + 2*bets[i] + " dollars!");
                        System.out.println();
                    }
                    else {
                        System.out.println("Dealer won against " + players[i].getName() + "!");
                        dealer.addMoney(bets[i]);
                    }
                    if(calcHandValue(players[i].getHands().get(0), false) == dealerVal) {
                        System.out.println("Tie");
                    }
                }
            }
            System.out.println();

            for (BlackJackPlayer ps : players) {
                ps.clearHands();
            }
        }
    }
}