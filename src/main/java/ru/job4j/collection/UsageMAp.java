package ru.job4j.collection;

import java.util.HashMap;

public class UsageMAp {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("kornienko.srs@mail.ru", "Kornienko Aleksey Andreevich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
