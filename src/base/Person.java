package base;

import java.util.*;

public class Person {
    public int personID;
    public static ArrayList<Person> personList = new ArrayList<>();
    public String name;
    public final String nationalID;


    public Person(String name, String nationalID) {
        this.name = name;
        this.nationalID = nationalID;
        personList.add(Person.this);
        personID = personList.size();
    }

    public static Person findById(int id) {
        for (Person person : personList)
            if (person.personID == id)
                return person;
        return null;
    }
}