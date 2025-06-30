package com.example;

public class MathOperations {

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }
}
