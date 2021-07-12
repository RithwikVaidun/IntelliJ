package APCS.People;

import java.util.ArrayList;
import java.util.Scanner;

public class People {
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
        for (Person person : people) {
            System.out.println(person);
        }
//        System.out.println(s);

    }
}
