package UML;

public abstract class TeamSport implements Sport {
    String name;
    String color;
    String city;
    String owner;
    int wins;
    int losses;
    Athlete players[];

    public TeamSport(Athlete[] players,String n, String c, String ci, String o, int w, int l){
        name = n;
        color = c;
        city = ci;
        owner = o;
        wins = w;
        losses = l;
        this.players = players;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getLosses() { return losses; }

    public int getWins() { return wins; }

    public String getCity() { return city; }

    public String getColor() { return color; }

    public void setCity(String city) { this.city = city; }

    public void setColor(String color) { this.color = color; }

    public String getOwner() { return owner; }

    public void setLosses(int losses) { this.losses = losses;
    }
    public void setOwner(String owner) { this.owner = owner; }

    public void setWins(int wins) { this.wins = wins; }
}
