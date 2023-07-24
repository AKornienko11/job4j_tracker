package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum() {
        int y = 2;
        return x + y;
    }

    public static int minus() {
        int z = 10;
        return z - x;
    }

    public int multiply() {
        int a = 4;
        return x * a;
    }

    public int divide() {
        int b = 15;
        return b / x;
    }

    public int sumAllOperation() {
        return sum() + multiply() + minus() + divide();
    }

    public static void main(String[] args) {
        int result = sum();
        System.out.println(result);
        int result1 = minus();
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int multi = calculator.multiply();
        System.out.println(multi);
        int div = calculator.divide();
        System.out.println(div);
        int allOperation = calculator.sumAllOperation();
        System.out.println(allOperation);
    }
}