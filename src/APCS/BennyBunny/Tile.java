package APCS.BennyBunny;

public class Tile {
    int x;
    int y;
    int c;
    boolean beenOn = false;
    Tile next = null;
    int maxPossible = 0;

    public Tile(){}

    public int getCount() {
        if (maxPossible != 0) return maxPossible;

        int total = 0;
        Tile loopT = null;
        for (Tile t = this; t != null; t = t.next) {
            if(t.beenOn){
                loopT = t;
                break;
            }
            if (t.maxPossible != 0) {
                total += t.maxPossible;
                break;
            }
            t.beenOn = true;
            total += t.c;
        }

        boolean changeT = true;

        for (Tile t = this; t != null && t.beenOn; t = t.next) {
            t.beenOn = false;
            if (t.maxPossible != 0) break;
            t.maxPossible = total;

            if(t == loopT)
                changeT = false;
            if(changeT)
                total -= t.c;
        }
        return maxPossible;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Tile getNext() {
        return next;
    }

    public void setNext(Tile next) {
        this.next = (this == next) ? null : next;
    }

    public int getC() {
        return  (maxPossible == 0) ? c : maxPossible;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String toString() {
        return ("(" + x + "," + y + "," + c + " m = " + maxPossible + ")");
    }
}
