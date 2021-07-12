package APCS.People;

public class Person implements java.lang.Comparable<Person> {
    private String name;
    private int age;
    private double weight;

    public Person(String n, int a, double w) {
        name = n;
        age = a;
        weight = w;
    }
    public Person(){

    }

    public String getName() { return name; }   public void setName(String name) { this.name = name; }

    public int getAge() { return age; }        public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }public void setWeight(double weight) { this.weight = weight; }

    public String toString(){
        return ("{" + name + ", " + age + ", " + weight + "}");
    }

    

    public int compareTo(Person p){
        int res = name.compareTo(p.getName());
        if(res != 0) return res;

        res = age - p.getAge();

        if(res!= 0) return res;
        double resW = weight -  p.getWeight();

        if(resW == 0)
            return 0;
        else if(resW < 0) return -1;
        else return 1;
    }



}
