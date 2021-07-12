public class tejasIsDumb {
    public static void main(String[] args) {
        int total = 50391;
        int hours = total/3600;
        int min = (total - hours*3600)/60;
        int sec = (total -(hours*3600 + min*60));
        System.out.println(hours + " hours, " + min + " minutes, and " + sec + " seconds.");
    }
}
