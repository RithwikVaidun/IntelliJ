package APCS.RemoveEvens;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemoveEvens {
    public static int getListSize(File f) throws FileNotFoundException {
        Scanner inp = new Scanner(f);
        int ans = 0;
        while (inp.hasNext()) {
            inp.next();
            ans++;
        }
        return ans;
    }

    public static int getFinalSize(File f) throws FileNotFoundException {
        //count odds
        Scanner inp = new Scanner(f);
        int ans = 0;
        while (inp.hasNext()) {
            String s = inp.next();
            if(s.length() % 2 != 0)
                ans++;
        }
        return ans;
    }

    public static void printOdds(File f, int n1, int n2) throws FileNotFoundException {
        Scanner inp = new Scanner(f);
        int c = -1;
        while (inp.hasNext()) {
            String s = inp.next();
            if(s.length() % 2 != 0){
                c++;
                if(c >= n1 && c <= n2)
                    System.out.println(s);
                if(c > n2)
                    break;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        boolean debug = true;
        if(debug){
            File f = new File("C:\\Users\\Anita Vaidun\\IdeaProjects\\Explore\\src\\APCS\\RemoveEvens\\HamletTitlePage.txt");
            //File f = new File("C:\Users\Anita Vaidun\IdeaProjects\Explore\src\APCS\RemoveEvens\Hamlet10Times.txt");

            System.out.println("ini size " + getListSize(f));
            System.out.println("removed size " + getFinalSize(f));
            printOdds(f,2,7);

        }
        else{
            Scanner console = new Scanner(System.in);

            System.out.println("Removes strings of even length from an array.");
            System.out.print("Enter filename for file containing strings: ");
            String file = console.next();
            File f = new File(file);
            System.out.println("Enter two indices for range of odd words to be printed out: ");
            int n1 = console.nextInt();
            int n2 = console.nextInt();
            System.out.println("initial list.size(): " + getListSize(f));
            System.out.println("final   list.size(): " + getFinalSize(f));
            System.out.println("odd words from index " + n1 + " to " + n2 + ":");
            printOdds(f,n1,n2);
        }
    }
}
