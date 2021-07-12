package Checkers;

public class Pieces {
    int x;
    int y;
    private String team;
    private boolean king;

    public Pieces(int x, int y, String team, boolean king) {
        this.x = x;
        this.y = y;
        this.team = team;
        this.king = king;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getTeam() {
        return team;
    }

    public boolean isKing() {
        return king;
    }

    public void setX(int a) {
        x = a;
    }

    public void setY(int a) {
        y = a;
    }

    public void setTeam(String a) {
        team = a;
    }

    public void setKing(boolean a) {
        king = a;
        team = team.toUpperCase();
    }

    public String toString() {
        return team;
    }


    public boolean isOnBoard() {
        return (x >= 0 && x <= 7) && ((y >= 0 && y <= 7));
    }

}
