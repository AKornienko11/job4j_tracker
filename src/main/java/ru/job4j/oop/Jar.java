package ru.job4j.oop;

public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar second) {
        this.value = this.value + second.value;
        second.value = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}