package model.calculator;

import model.Calculable;

public class Calculator implements Calculable{

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }
    
}
