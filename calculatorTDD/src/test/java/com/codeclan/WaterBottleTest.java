package com.codeclan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WaterBottleTest {
    WaterBottle bottle;
    @Before
    public void before() {
        bottle = new WaterBottle();
    }
    @Test
    public void hasVolume(){
        Assert.assertEquals(100, bottle.volume);
    }
    @Test
    public void canBeDrinkedFrom(){
        bottle.sipWater();
        bottle.sipWater();
        Assert.assertEquals(80, bottle.volume);
    }
    @Test
    public void canEmptyBottle(){
        bottle.emptyBottle();
        Assert.assertEquals(0, bottle.volume);
    }
    @Test
    public void canBeFilledToMax(){
        bottle.emptyBottle();
        bottle.fillBottle();
        Assert.assertEquals(100, bottle.volume);
    }
}
