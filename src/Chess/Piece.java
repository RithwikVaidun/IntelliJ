package Chess;

import javax.swing.*;

public abstract class Piece extends Chess {
    String name;
    boolean team;
    int x;
    int y;
    int value;
    int ID;
    JLabel label;

    public Piece(String n, boolean t, int x, int y,int v,int id){
        name = n;
        team = t;
        this.x = x;
        this.y = y;
        value = v;
        ID = id;
        label = new JLabel(new ImageIcon("White Pawn.png"));
    }
    public Piece(){}

    public String getName(){ return name; }
    public int getX() { return x; } public int getY() { return y; }
    public void setX(int x) { this.x = x; } public void setY(int y) { this.y = y; }
    public int getValue() { return value; }
    public int getID() { return ID; }  public void setID(int ID) { this.ID = ID; }

    public boolean getTeam() {
        return team;
    }
    public String toString(){
        return name;
    }
}
