package Chess;

import Chess.Pieces.Pawn;

import java.awt.*;

public class Board extends Chess {
    public Tile[][] b;

    public Board(){
        b = new Tile[8][8];
        Color bl = new Color(34,36,43);
        Color w = new Color(230,220,186);

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                Tile t = new Tile(i*75+150,j*75+150);
                b[i][j] = t;

                t.setColor(bl);
                if((i+j)% 2 == 0){
                    t.setColor(w);
                }

            }
        }
    }

    public Tile getT(int x, int y){
        return b[x][7-y];
    }

    public void setBoard(){
        for(int i = 0; i < 8; i++){
            Pawn p = new Pawn(true,i,1);
            getT(i,1).setP(p);
        }

    }
}
