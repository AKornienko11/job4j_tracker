package ru.job4j.collection;

import java.util.HashMap;

public class UsageMAp {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("kornienko.srs@mail.ru", "Kornienko Aleksey ");
        map.put("bozhok@yandex.ru", "Artem Bozhok");
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        map.put("kornienko.srs@mail.ru", "Kornienko Aleksey Andreevich");
        map.put("bozhok@yandex.ru", "Artem Evgenevich Bozhok ");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

    }
}
