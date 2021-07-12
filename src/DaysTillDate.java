public class DaysTillDate {
    static int calcDate (int month, int date, int year) {
        int nDays[] ={31,28,31,30,31,30,31,31,30,31,30,31};
        int adder = 0;
        for (int i = 0;i<month-1;i++) {
            adder  = nDays[i] + adder;
        }
        if (year%4==0) {
            nDays[1] = 29;
        }
        adder = adder + (year-1)*365;

        int leapCount = year/4;
        if (year%4!=0 && year>4 && month>3 && (year%100!=0 || year%400==0))
            leapCount++;
        if(year%100==0) {
            leapCount--;
        }

        int daysPassed = adder + date-1 + leapCount;
        return daysPassed;
    }
    public static void main(String[] args) {
       int x = calcDate(2,28,400);
       System.out.println(x + " " + x%7);

        x = calcDate(3,1,400);
        System.out.println(x + " " + x%7);
    }
}
