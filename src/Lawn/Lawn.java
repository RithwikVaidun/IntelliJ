package Lawn;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lawn {
    static String[][] lawn;
    static int xAr[];
    static int yAr[];
    static int top = 0;

    public static void printLawn(String[][] lawn) {
        for (String[] strings : lawn) {
            for (String string : strings) {
                System.out.print(string.toUpperCase());
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean saveIfCanMove(int row, int col) { //will only update if can
        if (lawn[row][col].equals("c")) return false;
        for(int r = -1; r <= 1; r++) {
            if ((row+r < 0) || (row+r >= lawn.length)) return false;
            for (int c = -1; c <= 1; c++) {
                if ((col+c < 0) || (col+c >= lawn[row+r].length) || lawn[row+r][col+c].equals("T")) return false;
            }
        }

        xAr[top] = row;
        yAr[top] = col;
        top++;

        return true;
    }

    public static void findPossibleMoves(int row, int col) {
        int colm1 = col-1;
        if (col == 0) {
            colm1= col;
        }
        saveIfCanMove(row-1,col);
        saveIfCanMove(row+1,col);
        saveIfCanMove(row,col+1);
        saveIfCanMove(row,colm1);
    }

    public static void cut(int row, int col) {
        lawn[row][col] = "c";
        for(int r = -1; r <= 1; r++) {
            for (int c = -1; c <= 1; c++) {
                int arrc = col+c;
                if (col == 0) {
                    arrc = col;
                }
                if (!lawn[row+r][arrc].equals("c"))
                    lawn[row+r][arrc] = "C";
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File lawnIn = new File("C:\\Users\\Anita Vaidun\\IdeaProjects\\Explore\\src\\Lawn\\lawnInp");
        Scanner myReader = new Scanner(lawnIn);
        int nLawns = myReader.nextInt();

        for(int i = 0; i < nLawns; i++) {

        int rows = myReader.nextInt();
        int col = myReader.nextInt();
        xAr = new int[rows * col];
        yAr = new int[rows * col];
        int sRow = myReader.nextInt() - 1;
        int sCol = myReader.nextInt() - 1;
        myReader.nextLine();
        lawn = new String[rows][col];

        for (int r = 0; r < lawn.length; r++) {
                String row = myReader.nextLine();
                String s[] = row.split(" ");
                for (int c = 0; c < s.length; c++) {
                    lawn[r][c] = s[c];
                }
        }

        while (true) {
                cut(sRow, sCol);
                findPossibleMoves(sRow, sCol);
                if (top == 0) break;
                top--;
                sRow = xAr[top];
                sCol = yAr[top];
        }
        printLawn(lawn);
        }
    }
}



