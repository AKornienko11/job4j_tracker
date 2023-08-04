package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (name != null) {
                rsl[count] = name;
                count++;
            }
        }
        rsl = Arrays.copyOf(rsl, count);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[items.length];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (key.equals(name.getName())) {
                names[count] = name;
                count++;
            }
        }
        names = Arrays.copyOf(names, count);
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        return names;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        System.out.println(tracker.findAll());
    }
}

