package com.example.javacalculatorwebapp;

public class Calculator {
    public static double calculate(double a, double b, String o) {
        double result = 0;
        switch (o) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0)
                    result = a / b;
                else
                    throw new ArithmeticException();
                break;
        }
        return result;
    }
}
