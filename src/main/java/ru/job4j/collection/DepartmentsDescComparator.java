package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String firs, String second) {
        String[] sec = second.split("/", 0);
        String[] fir = firs.split("/", 0);
        int result = sec[0].compareTo(fir[0]);
        if (result == 0) {
            result = firs.compareTo(second);
        }
        return result;
    }
}
