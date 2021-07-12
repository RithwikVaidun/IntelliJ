package APCS;

import java.util.Scanner;

public class Birthday {
    public static int daysTillBirth() {
        Scanner in = new Scanner(System.in);
        System.out.print("What is today's month (please enter a number from 1 to 12)");
        int sM = in.nextInt();

        System.out.print("What is today's date (please enter a number from 1 to 31)");
        int sD = in.nextInt();


        System.out.print("What is your birthday month (please enter a number from 1 to 12)");
        int bM = in.nextInt();

        System.out.print("What is birthday date (please enter a number from 1 to 31)");
        int bD = in.nextInt();
        int currentDateCount = sD;
        int bDateCount = bD;
        int daysSincebD, daysUntilbD;

        if ( sM == bM && sD == bD ) {
           return 0;
        }


        else
        {

            for (int i = 1; i < sM; i++)
            {
                //jan, mar, may, july, aug, oct, dec
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                {
                    currentDateCount = currentDateCount + 31;
                }
                //feb
                if (i == 2)
                {
                    currentDateCount = currentDateCount + 28;
                }
                //apr, jun, sept, nov
                if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    currentDateCount = currentDateCount + 30;
                }
            }

            // count the days between the birthday and the beginning of the year

            for (int i = 1; i < bM; i++)
            {
                //jan, mar, may, jul, aug, oct, dec
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                {
                    bDateCount = bDateCount + 31;
                }
                //feb
                if (i == 2)
                {
                    bDateCount = bDateCount + 28;
                }
                //apr, jun, sept, nov
                if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    bDateCount = bDateCount + 30;
                }
            }



            if (currentDateCount > bDateCount)
            {
                daysSincebD = currentDateCount - bDateCount;
                daysUntilbD = 365 - daysSincebD;
            }
            else //currentDateCount is less than bDCount
            {
                daysUntilbD = bDateCount - currentDateCount;
                daysSincebD = 365 - daysUntilbD;
            }



        }
        return Math.min(daysSincebD,daysUntilbD);


    }

    public static void main (String [] args) {
        int first = daysTillBirth();
        int sec = daysTillBirth();
        if(first > sec)
            System.out.println("The second person's birthday is sooner");
        else
            System.out.println("The first person's birthday is sooner");

    }
}
