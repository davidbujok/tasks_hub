package com.codeclan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer( 100, 35);
    }
    @Test
    public void hasSheets(){
        Assert.assertEquals(100, printer.sheets);
    }
    @Test
    public void printXCopies(){
        Assert.assertEquals(72, printer.Print(4,7));
    }
    @Test
    public void reduceTonerOnPrint(){
        printer.Print(3,5);
        Assert.assertEquals(20, printer.tonerVolume);
    }
}

