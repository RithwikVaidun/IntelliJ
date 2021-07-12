public class TrackTeam {
    String teamName;
    String n1, n2, n3, n4;
    Competition c1, c2;

    public TrackTeam (String tn, String n1, String n2, String n3, String n4, Competition c1, Competition c2) {
        teamName = tn;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.c1 = c1;
        this.c2 = c2;
    }

    public TrackTeam(TrackTeam t) {
        teamName = t.teamName;
        n1 = t.n1;
        n2 = t.n2;
        n3 = t.n3;
        n4 = t.n4;
        c1 = new Competition(t.c1);
        c2 = new Competition(t.c2);
    }

    public String getNames() {
        return (n1 + " " + n2 + " " + n3 + " " + n4);
    }

    public void setTeamName (String t) {
        teamName = t;
    }

    public void printTeam () {
        System.out.println("Team name is " + teamName);
        System.out.println("Names are " + getNames());
        c1.printCompetition();
        c2.printCompetition();
    }

    public void modifyComp(int year) {
        c1.modifyYear(year);
        c2.modifyYear(year);
    }

    public static void main(String[] args) {
       TrackTeam t1 = new TrackTeam ("Mission","Rithu","Rahul","dad","mom",
               new Competition("Race","xx","x", 2019),
               new Competition("Race2","zz","z", 2020));
       TrackTeam t2 = new TrackTeam(t1);
       t2.modifyComp(2021);
       t1.printTeam();
       t2.printTeam();

    }
}
