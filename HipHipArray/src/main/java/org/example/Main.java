package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        ArrayList<Integer> numbersLoop = new ArrayList<>();
        System.out.println(numbers[1]);

        numbersLoop.add(2);
        numbersLoop.add(5);
        numbersLoop.add(7);

        for(int i = 0; i < numbersLoop.size(); i++) {
            System.out.println(numbersLoop.get(i) * 2);
            numbersLoop.set(i, numbersLoop.get(i) * 2);
        }

//        for(type name : arrayName) {
//
//        }
        for (int number : numbersLoop) {
            System.out.println(number * 3);
        }
    }
}