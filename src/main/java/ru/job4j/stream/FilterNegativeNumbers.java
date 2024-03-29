package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 6, -8, 15, 22, -1, 5, 0);
        List<Integer> numbers = list.stream().filter(n -> n > 0).collect(Collectors.toList());
        numbers.forEach(System.out::println);
    }
}
