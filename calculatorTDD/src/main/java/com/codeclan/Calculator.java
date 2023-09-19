package com.codeclan;

public class Calculator {

    public int Sum(int number1, int number2){
        return number1 + number2;
    }
    public int Subtract(int number1, int number2){
        return number1 - number2;
    }
    public double Divide(float number1, float number2){ // it works with double's but in test need to pass > 3.0 <
        return number1/number2;
    }
}
