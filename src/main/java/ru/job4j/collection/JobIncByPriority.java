package ru.job4j.collection;

import java.util.Comparator;

public class JobIncByPriority implements Comparator<Job> {

        @Override
        public int compare(Job p, Job pp) {
                return Integer.compare(p.getPriority(), pp.getPriority());
        }
}