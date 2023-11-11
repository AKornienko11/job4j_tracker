package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {

    public Set<String> extractNumber(List<Tasks> tasks) {
        Set<String> result = new HashSet<>();
        for (Tasks task : tasks) {
            result.add(task.getNumber());
        }
        return result;
    }
}
