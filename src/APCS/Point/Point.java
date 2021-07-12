package APCS.Point;

public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int setX, int setY){
        x = setX;
        y = setY;
    }

    public String toString(){
        return "(" + getX() + ", " + getY() + ")";
    }

    public int getQuadrant(){
        if(x == 0 || y ==0)
            return 0;
        else if(x > 0 && y > 0)
            return 1;
        else if(x < 0 && y > 0)
            return 2;
        else if (x < 0)
            return 3;
        return 4;
    }

    public double distanceToOrigin(){
        return Math.sqrt(x * x + y * y);
    }

    public double slope(double x1, double y1, double x2, double y2){
        return (y2-y1)/(x2-x1);
    }

    public double slope(Point p){
        double num = (double) (p.getY()) - y;
        double den = (double) (p.getX())- x;
        return num/den;
    }
}
