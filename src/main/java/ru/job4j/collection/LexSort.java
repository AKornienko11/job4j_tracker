package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String numLeft = null;
        String numRight = null;
        for (String rslL : left.split(". ")) {
            numLeft = rslL;
            break;
        }
        for (String rslR : right.split(". ")) {
            numRight = rslR;
            break;
        }
        return Integer.compare(Integer.parseInt(numLeft), Integer.parseInt(numRight));
    }
}