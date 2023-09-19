package com.codeclan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class NumberListTest {
    private NumberList numbers;
    @Before
    public void before(){
       ArrayList<Integer> newNumbers = new ArrayList<>();
       newNumbers.add(3);
       newNumbers.add(5);
       newNumbers.add(4);
       newNumbers.add(2);
       numbers = new NumberList(newNumbers);
    }
    @Test
    public void hasNumberOfEntries(){
        Assert.assertEquals(4, numbers.getNumberOfEntries());
    }
    @Test
    public void hasEntry(){
        numbers.addNumber(12);
        Assert.assertEquals(5, numbers.getNumberOfEntries());
    }
    @Test
    public void getIndexOne(){
        numbers.addNumber(12);
        Assert.assertEquals(3, numbers.getNumberAtIndex(0));
    }
    @Test
    public void clearArrayList(){
        numbers.addNumber(16);
        numbers.addNumber(9);
        numbers.addNumber(17);
        numbers.cleanArrayList();
        Assert.assertEquals(0, numbers.getNumberOfEntries());
    }
    @Test
    public void countTotal(){
        Assert.assertEquals(14, numbers.getTotal());
    }
    @Test
    public void multiplyTotal(){
        Assert.assertEquals(120, numbers.multiplayAll());
    }
}
