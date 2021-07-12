package APCS.People;

import java.util.*;

public class PeoplePart2 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        String name = inp.next();


        while(!name.equals("stop")){
            int age = inp.nextInt();
            double weight = inp.nextDouble();

            Person p = new Person(name,age,weight);
            people.add(p);

            name = inp.next();

        }

//        people.add(new APCS.People.Person("Samuel",1,123));
//        people.add(new APCS.People.Person("Sammie",2,234));
//        people.add(new APCS.People.Person("Sammy",3,345));
//        people.add(new APCS.People.Person("Sam",4,456));
//        people.add(new APCS.People.Person("I",5,567));
//        people.add(new APCS.People.Person("Am",6,678));
        System.out.println("Original list: ");
        System.out.println(people + "\n");

        Collections.sort(people);
        //people = reverseOrder(people);
        System.out.println("Sorted list: ");
        System.out.println(people);
    }
}
