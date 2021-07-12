package APCS;

import java.util.Scanner;

public class AmongUs {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String players = console.nextLine();
        players = players.toLowerCase();
        findPlayerNames(players);
    }

    // Isolates the name of each player as a String in a loop
    public static void findPlayerNames(String players) {
        String[] allPlayers = players.split("_");
        for(String player : allPlayers) {
            if(isSus(player))
                System.out.println(player.toLowerCase() + " is sus");
            else
                System.out.println(player.toLowerCase() + " is not sus");
        }
    }

    // Checks if a player is sus based on their name
    public static boolean isSus(String player) {
        String shifted = "";

        for (int i = 0; i < player.length(); i++) {
            shifted = shifted + ((char)(((player.charAt(i) + 1) - 97) % 26 + 97));
        }
        int first = shifted.charAt(0);
        int last = shifted.charAt(shifted.length() -1);
        return (first + last) % 2 == 0;


    }
}
