package UML;

public class Athlete {
    String name;
    int age;
    String college;
    double height;
    double weight;
    int assists;
    int salaryWinnings;
    String impact;
    String impactOnWorld;

    public Athlete(String n, double h, double w){
        name = n;
        height = h;
        weight = w;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public double getHeight() { return height;}


    public double getWeight() { return weight; }

    public int getAge() { return age; }  public void setAge(int age) { this.age = age; }

    public void setHeight(double height) { this.height = height; }

    public String getImpact() { return impact; }

    public String getCollege() { return college; }


    public void setCollege(String college) { this.college = college; }

    public void setWeight(double weight) { this.weight = weight;}

    public int getMeasurable(){
        return assists + salaryWinnings;
    }

    public String getSubjective(){
        return impact + impactOnWorld;
    }
    public void getOverall(){
        System.out.println(getMeasurable());
        System.out.println(getSubjective());
    }
}
