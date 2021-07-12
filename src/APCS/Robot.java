package APCS;

import java.util.Scanner;
public class Robot {
    public static int x = 0;
    public static int y = 0;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String directions = console.nextLine();
        readDirections(directions);
    }
    // Isolates each direction as a String in a loop
    // As each direction is isolated, a call to move should be made
    // readDirections should also print out the final result

    public static void readDirections(String dirs) {
        String[] directions = dirs.split("_");
        for(String dir : directions) {
            move(dir);
        }
        System.out.println("(" + x + "," + y + ")");

    }
    // Moves the robot by editing the x and y variables
    public static void move(String dir) {
        if(dir.toLowerCase().equals("up"))
            y++;
        if(dir.toLowerCase().equals("down"))
            y--;
        if(dir.toLowerCase().equals("left"))
            x--;
        if(dir.toLowerCase().equals("right"))
            x++;
    }
}
