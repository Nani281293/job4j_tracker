package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    private static int sum(int y) {
        return x + y;
    }

    private static int minus(int z) {
        return z - x;
    }

    public int divide(int w) {
        return w / x;
    }

    public int sumAllOperation(int value) {
        return sum(value) + multiply(value) + minus(value) + divide(value);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int result1 = calculator.multiply(5);
        System.out.println(result1);
        int result2 = Calculator.minus(10);
        System.out.println(result2);
        Calculator calculator1 = new Calculator();
        int result3 = calculator1.divide(20);
        System.out.println(result3);
        int sum = calculator.sumAllOperation(10);
        System.out.println(sum);
    }
}
