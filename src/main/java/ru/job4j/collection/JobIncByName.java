package ru.job4j.collection;

import java.util.Comparator;

public class JobIncByName implements Comparator<Job> {

    @Override
    public int compare(Job n, Job nn) {
        return n.getName().compareTo(nn.getName());
    }
}
