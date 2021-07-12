import java.util.Scanner;

public class BackTrackTravel {
    public static int num = 0;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
        int targetX = inp.nextInt();
        int targetY = inp.nextInt();
        travel(targetX, targetY);
        System.out.println("Number of paths = " + num);
    }

    public static void travel(int targetX, int targetY) {
        explore(targetX, targetY, 0, 0, "moves:");
    }

    private static void explore(int targetX, int targetY, int currX, int currY, String path) {
        if (currX == targetX && currY == targetY) {
            System.out.println(path);
            num++;
        }
        else if (currX <= targetX && currY <= targetY) {
            explore(targetX, targetY, currX, currY + 1, path + " N");
            explore(targetX, targetY, currX + 1, currY + 1, path + " NE");
            explore(targetX, targetY, currX + 1, currY, path + " E");
        }
    }
}
