package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLang;

    public Programmer(String programLang, int experience, boolean degree) {
        super(degree, experience);
        this.programLang = programLang;
    }
}