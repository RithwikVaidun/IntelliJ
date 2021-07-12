package APCS.BedfordLaw;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;


/*Benford’s Law, also called the First-Digit Law, refers to the
frequency distribution of digits in many (but not all) real-life sources of data. In this
distribution, 1 occurs as the leading digit about 30% of the time, while larger digits occur in
that position less frequently, for example 9 as the first digit occurs less than 5% of the time.*/

//This program reads a file on integers and displays the Benfords stats for each digit 1-9.

public class BedfordLaw {
    public static int getFirstDig(int n) { //Gets the first digit of the int passed
        // Remove last digit from number
        // till only one digit is left
        while (n >= 10)
            n /= 10;

        // return the first digit
        return n;
    }
    public static int count0(File f) throws FileNotFoundException { //Counts the numbers of zeroes in the file passed
        Scanner inp = new Scanner(f);
        int count = 0;
        while(inp.hasNextInt()) {               //Will keep reading the file for all ints
            if(inp.nextInt() == 0)              //If you find a zero then increase count
                count++;
        }
        return count;     //Return the number or zeros
    }
    public static void printBenfordStats(File f) throws FileNotFoundException { //Prints the table for the stats for each digit
        Scanner inp = new Scanner(f);
        double totalC = 0;                          // To count all of the ints in the file
        int[] counts = new int[9];                  //To keep track of the counts for each digit 1-9
        System.out.println("Digit Count Percent");
            while(inp.hasNextInt()){                //Will keep reading the file for all ints
                int curN = inp.nextInt();           //The number we are checking
                if(curN == 0)
                    continue;                       //If it is a zero we dont want to add it to our total count in line 46
                 int x = getFirstDig(curN);
                 counts[x-1]++;                 //If the first digit is 1, then index 0(the first element) will increase by 1. The number of 1's found increases.
                                                    //For any first digit, that digit's count will increase it its place in the counts array.
                totalC++;                           //Counting all the ints
            }

            for(int i = 0; i < counts.length ; i++){ //To print the table
                double per = counts[i]/totalC*100;
                System.out.printf("%5d %5d %6.2f\n", i, counts[i], per); //Displaying the digit, count, and percentage of how much it occurs
            }
        System.out.println("Total    " + (int)totalC + " 100.00");
    }
    public static void main(String[] args) throws FileNotFoundException { //Main method declaration
        // Taking the input of the file name and reading from that file
        Scanner console = new Scanner(System.in);

        //Output
        System.out.println("Let us count those leading digits...");
        System.out.print("input file name? ");
        System.out.println();
        String file = console.next();
        File f = new File("C:\\Users\\Anita Vaidun\\IdeaProjects\\Explore\\src\\APCS\\BedfordLaw\\USCities.txt");
        //File f = new File(f);
        if(count0(f) != 0)
            System.out.println("excluding " + count0(f) + " zeros"); //If there are zeros in the file, this line is letting the user know that it is excluding those zeroes in the calculations
        printBenfordStats(f);//Displays the stats
    }
}
