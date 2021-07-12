public class Temperature1 {
    double temp;
    char scale;

    public Temperature1() {
        temp = 0;
        scale = 'C';
    }

    public Temperature1(int t, char s) {
        temp = t;
       scale = s;
    }

    public Temperature1(int t) {
       temp = t;
       scale = 'C';
    }

    public Temperature1(char s) {
       scale = s;
       temp = 0;
    }

    public String toString() {
        return "The temperature is " + temp + " degrees " + scale;
    }

    public double compareTo(Temperature1 t) {
        double t1 = getFaren();
        double t2 = t.getFaren();
        return t1 - t2;
    }
    public boolean isLess (Temperature1 t) {
        double t1 = getFaren();
        double t2 = t.getFaren();
        return (t1 < t2);
    }
    public boolean isGreater (Temperature1 t) {
        double t1 = getFaren();
        double t2 = t.getFaren();
        return (t1 > t2);
    }
    public boolean isEqual (Temperature1 t) {
        double t1 = getFaren();
        double t2 = t.getFaren();
        return (t1 == t2);
    }


    public double getFaren() {
        double tempF = temp;
        if (scale == 'C') {
            tempF = (9*(temp)/5)+32;
        }
        int t = (int) (tempF * 10 + 0.5);
        return (float) t / 10;
    }

    public double getCel() {
        double tempC = temp;
        if (scale == 'F') {
            tempC = 5*(temp-32)/9;
        }
        int t = (int) (tempC * 10 + 0.5);
        return (double) t / 10;
    }

    public void setTemp(double t) {
        temp = t;
    }

    public static void main(String[] args) {
        Temperature1 fremont = new Temperature1(20,'C');
        Temperature1 sfo = new Temperature1(20, 'C');
//        System.out.println(fremont.getCel());
        System.out.println(sfo.isEqual(fremont));
//        if (sfo.compareTo(fremont) < 0) System.out.println("SFO is cooler");
//        else System.out.println("SFO is hotter");
//        if (fremont.compareTo(tahoe) < 0) System.out.println("SFO is cooler");

    }
}
