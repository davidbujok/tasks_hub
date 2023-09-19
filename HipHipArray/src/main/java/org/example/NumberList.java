package org.example;

import java.util.ArrayList;

public class NumberList {
    private ArrayList<Integer> numbers;

    public NumberList() {
        this.numbers = new ArrayList<>();
    }

    public int getSize(){
        return numbers.size();
    }

    public void addNumber(int i) {
        this.numbers.add(i);
    }

    public int getNumberAtIndex(int i) {
        return this.numbers.get(i);
    }

    public void multiplyNumbersBy2() {
        for(int i=0; i < this.getSize(); i++){
            this.numbers.set(i, this.getNumberAtIndex(i) * 2);
        }
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
