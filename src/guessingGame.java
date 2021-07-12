import java.util.Scanner;

public class guessingGame {
    public static int getRand(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rand = getRand(1,100);
        //System.out.println(rand);
        boolean guessed = false;
        int count = 0;

        while(!guessed){
            System.out.println("Guess a number");
            int n = inp.nextInt();
            if(n > rand)
                System.out.println("Too high!");
            else if (n < rand)
                System.out.println("Too low!");
            else
                guessed = true;
            count++;
        }
        System.out.println("You took " + count + " tries to guess the number " + rand);
    }
}
