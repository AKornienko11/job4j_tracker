package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + multiply(c) + minus(c) + divide(c);
    }

    public static void main(String[] args) {
        int result = sum(2);
        System.out.println(result);
        int result1 = minus(10);
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int multi = calculator.multiply(4);
        System.out.println(multi);
        int div = calculator.divide(15);
        System.out.println(div);
        int allOperation = calculator.sumAllOperation(20);
        System.out.println(allOperation);
    }
}