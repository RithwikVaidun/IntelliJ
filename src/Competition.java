public class Competition {
    String nameCom;
    String winner;
    String runUp;
    int year;

    public Competition(Competition c) {
        nameCom = c.nameCom;
        winner = c.winner;
        runUp = c.runUp;
        year = year;
    }

    public Competition(String name, String w, String r, int yr) {
        nameCom = name;
        winner = w;
        runUp = r;
        year = yr;
    }

    public void modifyYear (int y) {
        year = y;
    }

    public void printCompetition() {
        System.out.println("Competition name is " + nameCom);
        System.out.println("The winner is " + winner);
        System.out.println("The runner up is " + runUp);
        System.out.println("The race was in " + year);
    }
}
