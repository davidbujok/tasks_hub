package org.example;

import java.util.ArrayList;

public class BusStop {
    Person person;
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }
    public int getSize(){
        return this.queue.size();
    }
    public Person removePerson(){
        this.queue.remove(0);
        return null;
    }

    public void addPerson(Person person){
        this.queue.add(person);
    }
}
