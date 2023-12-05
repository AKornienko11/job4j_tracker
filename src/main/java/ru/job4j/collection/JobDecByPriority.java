package ru.job4j.collection;

import java.util.Comparator;

public class JobDecByPriority implements Comparator<Job> {
    @Override
    public int compare(Job p, Job pp) {
        return Integer.compare(pp.getPriority(), p.getPriority());
    }
}
