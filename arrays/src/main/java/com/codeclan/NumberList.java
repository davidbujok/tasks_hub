package com.codeclan;

import java.util.ArrayList;

public class NumberList {
    private ArrayList<Integer> numbers;
    public NumberList(ArrayList<Integer> numbers){
        this.numbers =  numbers;
    }
    public int getNumberOfEntries(){
        return this.numbers.size();
    }
    public boolean addNumber(int number){
        this.numbers.add(number);
        return true;
    }
    public int getNumberAtIndex(int index){
        return this.numbers.get(index);
    }
    public boolean cleanArrayList(){
        this.numbers.clear();
        return true;
    }
    public int getTotal(){
        int total = 0;
        for (int i=0; i<getNumberOfEntries(); i++) {
            total += getNumberAtIndex(i);
        }
        return total;
    }
    public int multiplayAll(){
        int total = 1;
        for (int number: this.numbers){
            total *= number;
        }
        return total;
    }
}
