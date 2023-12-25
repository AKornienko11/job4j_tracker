package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> departments) {

        Set<String> result = new LinkedHashSet<>();
        for (String value : departments) {
            String start = "";
            for (String element : value.split("/")) {
                result.add(start + element);
                start = start.concat(element).concat("/");
            }
        }
        return new ArrayList<>(result);
    }

    public static void sortAsc(List<String> departments) {
        Collections.sort(departments);
    }

    public static void sortDesc(List<String> departments) {
        Collections.sort(departments, new DepartmentsDescComparator());
    }

    public static void main(String[] args) {

        Set<String> result = new LinkedHashSet<>();
        List<String> input = Arrays.asList("K1/SK1/SSK1", "K1/SK1/SSK2", "K2/SK1/SSK1");
        for (String res : input) {
            String value = "";
            for (String ch : res.split("/")) {
                result.add(value + ch);
                value = value.concat(ch).concat("/");
            }
        }
        for (String set : result) {
            System.out.println(set);
        }

    }
}


