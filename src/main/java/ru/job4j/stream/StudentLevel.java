package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted((a, b) -> Integer.compare(b.getScore(), a.getScore()))
                .takeWhile(volume -> volume.getScore() >= bound)
                .collect(Collectors.toList());

    }
}
