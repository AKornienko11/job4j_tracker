package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public Reduce(int[] array) {
        this.array = array;
    }

    public void to() {
        array = new int[]{6, 7, 8};
    }

    public void print() {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Reduce reduce = new Reduce(new int[]{1, 2, 3});
        reduce.to();
        reduce.print();
    }
}