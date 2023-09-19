package org.example;

import java.util.ArrayList;

public class Bear {

    private River river;
    private Salmon salmon;
    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String _name) {
        this.name = _name;
        this.belly = new ArrayList<Salmon>();
    }

    public int foodCount(){
        return belly.size();
    }
    public void eat(Salmon _salmon){
        this.belly.add(_salmon);
    }
    public void eatFishFromRiver(River river){
        Salmon fish = river.removeFish();
        this.eat(fish);

    }
}
