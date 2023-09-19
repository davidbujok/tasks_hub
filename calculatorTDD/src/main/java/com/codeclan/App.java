package com.codeclan;

public class App
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        System.out.println(calculator.Sum(3,5));
        System.out.println(calculator.Divide(9,2));
        System.out.println(calculator.Subtract(10,5));
    }
}
