package ru.job4j.cast;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит по воздуху");
    }

    @Override
    public void speed() {
        System.out.println("Самолет движется со скоростью 900 км/ч");
    }
}
