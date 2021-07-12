package Chess;

import javax.swing.*;
import java.awt.*;

public class Tile extends Chess {
    //On the drawing panel 1-900
    public int x;
    public int y;
    public boolean isOpen = true;
    public int size = 75;
    public Piece p = null;

    public Tile(int x, int y){
        this.x = x;
        this.y = y;

    }


    public void setColor(Color c){
        g.setColor(c);
        g.fillRect(x,y,size,size);
    }


    public Piece getP() {
        return p;
    }

    public void setP(Piece p) {
        this.p = p;
    }

    public void drawPawn(boolean team){ //takes in board spot - draws there
        Color c = (team) ? Color.white : Color.black;
        g.setColor(c);
        g.fillRect(x+27,y+14,20,50);
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
