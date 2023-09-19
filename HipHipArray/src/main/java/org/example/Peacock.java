package org.example;

import java.lang.reflect.Array;

public class Peacock {
    private String[] colours;

    public Peacock() {
        this.colours = new String[]{"Brown", "Green", "Yellow", "Blue"};
    }

    public String[] getColours() {
        return this.colours;
    }
    public String getColourFromIndex(int index) {
        return this.colours[index];
    }
    public void changeColour(String colour, int index){
        this.colours[index] = colour;
    }

}
