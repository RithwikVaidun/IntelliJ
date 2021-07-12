public class Calendar {
    static int printMonth(String month, int startDay, int nDays) {
        int ret = 0;
        System.out.println(month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat ");
        for(int i=0; i<startDay; i++) {
            System.out.print("    ");
        }
        for(int i=1; i<=nDays; i++) {
            System.out.print(" " + i + " ");
            if (i<10)
                System.out.print(" ");
            ret =(startDay + i) % 7;
            if (ret == 0)
                System.out.println("");
        }
        if (ret != 0)
            System.out.println();
        return (ret);
    }
    static int calcDate(int month, int date, int year) {
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
        String months[] = {"Jan","Feb","Mar","Apr","May","June","July","August","Sep","October","Nov","Dec"};
        int nDays[] ={31,28,31,30,31,30,31,31,30,31,30,31};
        int startDay = calcDate(1,1,2019)%7;
        for (int m = 0; m<12; m++ ) {
            startDay = printMonth(months[m],startDay,nDays[m]);
        }
    }
}
