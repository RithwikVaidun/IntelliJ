package Checkers;

public class Board {
    private static Pieces[][] board;

    public Board() {
        board = new Pieces[8][8];
        // setting up the board.
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                board[x][y] = null;
                if((x+y) % 2 == 1){
                    if(x<=2)
                        board[x][y] = new Pieces(x,y,"b",false);
                    else if(x >= 5)
                        board[x][y] = new Pieces(x,y,"r",false);
                }
            }
        }

    }


    public void placePiece(int x, int y, Pieces a) {
        board[x][y] = a;
    }

    public void removePiece(Pieces p) {
        board[p.getX()][p.getY()] = null;
    }

    public Pieces getBoard(int x, int y) {
        return board[x][y];
    }

    public Pieces getPiece(Pieces p, String d,int m){
        int[] newC = getCoords(p,d,m);
        return board[newC[0]][newC[1]];
    }
    public int[] getCoords(Pieces p, String d, int m) {
        int x = p.getX();
        int y = p.getY();

        if(d.equals("tl") && (x-m >= 0 && y-m >= 0))
            return new int[]{x-m, y-m};
        if(d.equals("tr") && (x-m >= 0 && y+m <= 7))
            return new int[] {x-m,y+m};
        if(d.equals("bl") && (x+m <= 7 && y-m >= 0))
            return new int[] {x+m,y-m};
        if(d.equals("br") && (x+m <= 7 && y+m <= 7))
            return new int[] {x+m,y+m};
        return null;
    }
    public boolean isAvailable(Pieces p, String d,int m){
        return getPiece(p, d, m) == null;
    }

    public void movePiece(Pieces p, String d, int m) {//Piece, direction, how much you move it
        placePiece(p.getX(),p.getY(),null);
        int[] newC = getCoords(p,d,m);
        int x = newC[0];
        int y = newC[1];
        placePiece(x,y,p);
        p.setX(x);
        p.setY(y);

        if ((x == 0 && p.getTeam().equals("r")) ||
                (x == 7 && p.getTeam().equals("b"))) {
            p.setKing(true);
        }
    }

    public void printBoard() {
        System.out.println("               Black ");
        for (int r = 0; r < 8; r++) {
            System.out.println(" |---+---+---+---+---+---+---+---|");
            System.out.print(Math.abs(r-7) +"|");
            for (int c = 0; c < 8; c++) {
                if (board[r][c] != null) { //if there is a piece there
                    System.out.print(" " + board[r][c] + " |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.println();
        }
        System.out.println(" |---+---+---+---+---+---+---+---|");
        System.out.println("   0   1   2   3   4   5   6   7");
        System.out.println("               Red ");
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.board[7][2].setTeam("G");
        b.printBoard();

//        int[][] board = new int[8][8];
//        for (int r = 0; r < board.length; r++) {
//            for (int c = 0; c < board[0].length; c++) {
//                board[r][c] = 0;
//            }
//        }
//        board[0][1] = 9;
    }
//    public static void printArray(int[][] a) {
//        for (int[] ints : a) {
//            for (int j : ints) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }

}