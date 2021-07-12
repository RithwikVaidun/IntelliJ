public class Shopping {
    String obj;
    int yearP;

    public Shopping(String o, int p) {
        obj = o;
        yearP = p;
    }

    public String setObj(String n) {
        obj = n;
        return n;
    }

    public int setYear(int y) {
        y = yearP;
        return y;
    }

    public int possesionY() {
        return 2020-yearP;
    }

    public String toString(){
        return obj + "was purchased on" + yearP;
    }


    public static void main(String[] args) {
        Shopping rith = new Shopping("apple", 2000);
        System.out.println(rith.setObj("Samsung"));
        System.out.println(rith.possesionY());
    }
}