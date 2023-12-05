package ru.job4j.collection;

import java.util.Comparator;

public class JobDecByName implements Comparator<Job> {

    @Override
    public int compare(Job n, Job nn) {
        return nn.getName().compareTo(n.getName());
    }
}