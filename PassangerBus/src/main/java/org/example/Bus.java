package org.example;

import java.util.ArrayList;

public class Bus {
    Person person;
    private ArrayList<Person> passangers;
    private String destination;
    private int capacity;

    public Bus(ArrayList<Person> passengers, String destination, int capacity) {
        this.passangers = passengers;
        this.destination = destination;
        this.capacity = capacity;
    }

    public ArrayList<Person> getPassangers() {
        return passangers;
    }
    public int getNumberOfPeopleInTheBus(){
        return passangers.size();
    }
    public String onboardPassenger(Person person) {
        if (!isFull()) {
            passangers.add(person);
            return "Welcome on board!";
        } else {
            return "Sorry it's full";
        }
    }
    public void removePassenger(){
        passangers.remove(0);
    }
    public void addPassenger(BusStop busstop){
        person = busstop.removePerson();
        this.passangers.add(person);
    }

    public boolean isFull(){
        return passangers.size() >= capacity;
    }

    public void setPassangers(ArrayList<Person> passengers) {
        this.passangers = passengers;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
