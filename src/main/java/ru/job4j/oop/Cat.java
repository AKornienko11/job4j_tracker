package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);

    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void givNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("Food for ");
        Cat gav = new Cat();
        gav.givNick("Gav - ");
        gav.eat("kotleta");
        gav.show();
        System.out.println("Food for ");
        Cat black = new Cat();
        black.givNick("Black - ");
        black.eat("fish");
        black.show();
    }
}


