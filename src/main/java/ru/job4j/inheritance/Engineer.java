package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int experience;

    public Engineer(boolean degree, int experience) {
        super(degree);
        this.experience = experience;

    }
}