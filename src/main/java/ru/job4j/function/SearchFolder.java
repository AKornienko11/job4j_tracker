package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> result = new ArrayList<>();
        for (Folder folder : list) {
            if (predicate.test(folder)) {
                result.add(folder);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SearchFolder.filter(List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        ), (Folder folder) -> folder.getName().contains("bug")));

        System.out.println(SearchFolder.filter(List.of(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        ), (Folder folder) -> folder.getSize() > 100));
    }
}