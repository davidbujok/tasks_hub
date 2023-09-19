package org.example;

import java.util.ArrayList;

public class River {

    private Salmon salmon;
    private ArrayList<Salmon> fishes;

    public River() {
        this.fishes = new ArrayList<>();
    }

    public void add(Salmon _salmon){
        this.fishes.add(_salmon);
    }
    public int getFishCount(){
        return this.fishes.size();
    }
    public Salmon removeFish(){
        return this.fishes.remove(0);
    }

}
