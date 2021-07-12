package APCS.PersonalityTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//The Keirsey Temperament Sorter (http://www.keirsey.com/) is a personality test that involves answering 70
//        questions.
//        The Keirsey test measures four independent dimensions of personality:
//        1. Extrovert versus Introvert (APCS.GFEH.E vs I): what energizes you
//        2. Sensation versus iNtuition (S vs N): what you focus on
//        3. Thinking versus Feeling (T vs F): how you interpret what you focus on
//        4. Judging versus Perceiving (J vs P): how you approach life
//        Individuals are categorized as being on one side or the other for each dimension. The corresponding letters are
//        put together to form a personality type. For example, if you are an Extrovert, iNtuitive, Thinking, Perceiving person then
//        you are referred to as an ENTP.

public class Personality {
    public static final int numDim = 4; //4 traits in this survey

    public static String getPersonality(double[] a,double[] b){ //Returns the 4 letters of your personality depending on how you answered the questions
        String ans = "";
        String traits = "EISNTFJP";
        for(int i = 0; i < 4; i++){
            double denom = a[i]+b[i];
            if(a[i]/denom > b[i]/denom)
                ans += traits.charAt(i*2); //The string concatenates the correct letter depending on which dimension you are in. The i variable corresponded to the character in the "traits string"
            else if(a[i]/denom == b[i]/denom)
                ans += "X";
            else ans += traits.charAt(i*2+1);
        }
        return ans; //Returns 4 letter personality
    }


    public static void processAnswers(String answers){ //This method takes in the 70 answers and displays the stats and personality.
        double[] aCount = new double[numDim];
        double[] bCount = new double[numDim]; //The arrays for each count of how many "A" answers and how many "B" answers.

        String[] ans = answers.split("");

        for(int i = 0; i < ans.length;i++){ //Looping through all 70 answers
            if(ans[i].toUpperCase().equals("A"))
                aCount[(i%7+1)/2]++;
            else if(ans[i].toUpperCase().equals("B"))
                bCount[(i%7+1)/2]++;
            // The algorithm (1%7+1)/2 gives us exactly where we to increase our count in the a or b counts array. We do this because there are 4 elements, each corresponding with the 4 dimensions or 4 traits
        }

        String personality = getPersonality(aCount,bCount); //The 4 letter personality for the current person you are analyzing

        String stats = "";
        for(int i = 0; i < 4;i++){
            stats += (int)aCount[i] + "A-" + (int)bCount[i] + "B";
            if(i != 3)
                stats += " ";
        }
        //Formatting the display of how many "A" answers and how many "B" answers.

        String percents = "[";
        for(int i = 0; i < 4;i++){
            percents = percents + Math.round((bCount[i]*100)/(aCount[i]+bCount[i]))+ "%";
            if(i != 3)
                percents += ", ";
        }
        percents += "]" + " = " + personality;
        //Formatting the display the "B" percents of all dimensions.

        System.out.println("    " + stats);
        System.out.println("    " + percents);
    }

    public static void processFile(File f) throws FileNotFoundException { //This method takes in a file analyzes the survey answers for each person found in that file
        Scanner inp = new Scanner(f);
        while(inp.hasNext()){
            String name = inp.nextLine();
            String answers = inp.nextLine();
            System.out.println(name + ":");
            processAnswers(answers);
            if(inp.hasNext()) {
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        while(true){ //Will keep asking for a file input until a file is found
            Scanner console = new Scanner(System.in);
            System.out.print("Input file name: ");
            String file = console.next();
            File f = new File(file);
            try{
                processFile(f); //Displays the stats for all the people in the file
                break;
            }
            catch (FileNotFoundException x){
                System.out.println("File not found. Try again"); //Will prompt user to enter another file if the file is not found
            }
        }
    }
}
