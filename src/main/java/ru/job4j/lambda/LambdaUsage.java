package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eeeee", "a", "ccc", "dddd", "bb");
        Comparator<String> comparator = (str1, str2) -> {
            System.out.println("compare - " + str2.length() + " : " + str1.length());
            return Integer.compare(str2.length(), str1.length());
        };

        list.sort(comparator);
        System.out.println();
        for (String res : list) {
            System.out.println(res);
        }
    }
}
