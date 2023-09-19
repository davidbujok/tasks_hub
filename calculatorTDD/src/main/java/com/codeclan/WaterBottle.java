package com.codeclan;

public class WaterBottle {
    public int volume;

    public WaterBottle(){
        this.volume = 100;
    }
    public int sipWater(){
        return this.volume -= 10;
    }
    public int emptyBottle(){
        return this.volume = 0;
    }
    public int fillBottle(){
        return this.volume = 100;
    }
}
