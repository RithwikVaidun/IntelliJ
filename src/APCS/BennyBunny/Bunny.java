package APCS.BennyBunny;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bunny {
    public static Tile[][] b;

    public static void printArray()  {
        for (int y = 0; y < b.length; y++) {
            for (int x = 0; x < b.length; x++) {
                System.out.print(b[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void setNext(int x, int y) {
        Tile t = b[x][y];
        int nx = t.getX()+x;
        int ny = t.getY()+y;
        t.setNext(((nx >= b.length) || (nx < 0) || (ny >= b.length) || (ny < 0)) ? null: b[nx][ny]);
    }

    public static void readBoard(File f) throws FileNotFoundException {
        Scanner inp = new Scanner(f);
        int size = inp.nextInt();
        b = new Tile[size][size];

        for (int t = 0; t < 3; t++) {
            for (int y = 0; y < size; y++) {
                for (int x = 0; x < size; x++) {
                    if (b[x][y] == null)
                        b[x][y] = new Tile();
                    if (t == 0)
                        b[x][y].setX(inp.nextInt());
                    if (t == 1)
                        b[x][y].setY(inp.nextInt());
                    if (t == 2) {
                        b[x][y].setC(inp.nextInt());
                        setNext(x,y);
                    }
                }
            }
        }
    }

    public static int findMax() {
        int max = -1;
        for (int y = 0; y < b.length; y++) {
            for (int x = 0; x < b.length; x++) {
                int n = b[x][y].getCount();
                if(n > max)
                    max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) throws FileNotFoundException {
        boolean debug = true;
        if(debug){
            String file = "C:\\Users\\Anita Vaidun\\IdeaProjects\\Explore\\src\\APCS\\BennyBunny\\0.txt";
            File f = new File(file);
            readBoard(f);
            System.out.println(findMax());
            printArray();
        }
        else{ //Hyper grade
            Scanner console = new Scanner(System.in);
            System.out.print("Enter name of text file: ");
            String file = console.next();
            File f = new File(file);
            readBoard(f);
            System.out.println(findMax());
        }
    }
}
