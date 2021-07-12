package Chess.Pieces;

import Chess.Piece;

public class Pawn extends Piece {
    public Pawn(boolean t, int x, int y){
        super("Pawn",t,x,y,1,1);
        b.getT(x,y).drawPawn(t);

    }

}
