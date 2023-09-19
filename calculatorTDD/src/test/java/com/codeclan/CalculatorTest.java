package com.codeclan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before() {
        calculator = new Calculator();
    }
    @Test
    public void sumNumbers(){
        Assert.assertEquals(5, calculator.Sum(2,3));
    }
    @Test
    public void subtractNumbers(){
        Assert.assertEquals(7, calculator.Subtract(20,13));
    }
    @Test
    public void divideNumbers() {
        Assert.assertEquals(3.5, calculator.Divide(7, 2), 0.0);
    }
}
