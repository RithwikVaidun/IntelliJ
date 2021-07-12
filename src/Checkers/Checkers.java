package Checkers;

import java.util.Scanner;


public class Checkers {

    static Board b = new Board();
    static int red = 12;
    static int  black = 12;

    public static int getNumber(Scanner inp, int min, int max) {
        int num;
        while (true) {
            if (inp.hasNextInt()) {
                num = inp.nextInt();
                if(min <= num && num <= max) {
                    break;
                }
                else {
                    System.out.println("Please enter a number between " + min + " and " + max);
                }
            }
            else {
                inp.next();
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return num;
    }
    public static String getChoice(Scanner keyboard,String prompt, String a, String b){
        System.out.println(prompt);
        String ret;
        while(true){
            ret = keyboard.next();
            if(ret.equals(a) || ret.equals(b)){
                break;
            }
            else{
                System.out.println("Please enter only " + a + "or "  + b);
            }
        }
        return ret;
    }

    public static boolean canCut(Pieces p){
        return canCut(p, "tl") || canCut(p, "tr") || canCut(p, "br") || canCut(p, "bl");
    }


    public static boolean canCut(Pieces p, String d){
        String team = p.getTeam();
        return b.isAvailable(p, d, 2) && !(b.getPiece(p, d, 1).getTeam().equals(team));
    }

    public static boolean canMove(Pieces p, String d){
        return b.isAvailable(p, d, 1) || canCut(p, d);
    }


    public static void movePiece(Pieces p, String d) {
        if(b.isAvailable(p,d,1)){
            b.movePiece(p,d,1);
        }
        else {
            cutUpdate(p,d);
        }
    }

    public static void cutUpdate(Pieces p, String d){
        b.removePiece(b.getPiece(p,d,1));
        b.movePiece(p,d,2);

        if(p.getTeam().equalsIgnoreCase("r")){
            black--;
        }
        else red--;
    }

    public static String getDirection(Pieces p, String f, String l){
        String team = p.getTeam();
        String ans = "";
        if(team.equalsIgnoreCase("r"))
            ans += (f.equals("f")) ? "t" : "b";
        else
            ans += (f.equals("f")) ? "b" : "t";

        ans += l;
        return ans;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean gameOver = false;
        int turn = 0;
        String player;
        String score;
        while (!gameOver) {
            score = ("Black: " + black + " Red: " + red);
            b.printBoard();
            System.out.println(score);

            player = (turn%2 == 0) ? ("Red") : ("Black");

            System.out.println(player);
            System.out.println("Choose a piece. Enter the column and then the row");
            Pieces p;
            while(true){
                int y = getNumber(keyboard,0,7);
                int x = 7 - getNumber(keyboard,0,7);
                p = b.getBoard(x,y);

                if(p == null){
                    System.out.println("Piece does not exist. Select another piece.");
                    continue;
                }
                if(!(p.getTeam().equalsIgnoreCase(player.substring(0,1)))){
                    System.out.println("Not your piece. Select another piece");
                    continue;
                }
                
                String f = "f";
                if(p.isKing()){
                    f = getChoice(keyboard,"Forwards or Backwards(f or b)","f","b");
                }

                String move = getChoice(keyboard,"Left or Right(l or r)","l","r");
                String dir = getDirection(p,f,move);

                if(canMove(p,dir)){
                    movePiece(p,dir);
                    if(canCut(p)){
                        System.out.println("Double cut");
                    }
                    break;
                } else{
                    System.out.println("Piece cannot move. Select another piece.");
                }
            }
            turn++;

            if(black == 0){
                System.out.println("White wins!");
                gameOver = true;
            }
            if(red == 0){
                System.out.println("Black wins!");
                gameOver = true;
            }
        }
    }
}
