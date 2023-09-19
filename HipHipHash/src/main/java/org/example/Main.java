package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap<String, String> favouriteFruits;
        favouriteFruits = new HashMap<>();

        favouriteFruits.put("Jason", "Banana"); // put key value in array
        favouriteFruits.put("Alice", "Apples"); // put key value in array
        favouriteFruits.put("Robot", "Steel"); // put key value in array
        favouriteFruits.put("Mr Potato", "Sweetpotato"); // put key value in array

        System.out.println(favouriteFruits.containsKey("Jason"));
        System.out.println(favouriteFruits.containsValue("Steel"));
        favouriteFruits.remove("Mr Potato");
        favouriteFruits.replace("Robot", "Wood");
        System.out.println(favouriteFruits.get("Alice"));
        System.out.println(favouriteFruits.get("Robot"));
        favouriteFruits.clear();
    }
}