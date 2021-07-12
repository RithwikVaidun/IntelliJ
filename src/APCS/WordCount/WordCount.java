package APCS.WordCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter name of text file, e.g. Iliad.txt: ");
        String file = console.next();

        File f = new File(file);
        Scanner inp = new Scanner(f);
        int nWords = 0;
        while(inp.hasNext()){
            inp.next();
            nWords++;
        }
        System.out.println("Total words = " + nWords);
    }
}
