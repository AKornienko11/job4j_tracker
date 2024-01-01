package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int finish, Function<Double, Double> function) {
        List<Double> result = new ArrayList<>();
        for (double i = start; i < finish; i++) {
            result.add(function.apply(i));
        }
        return result;
    }
}
