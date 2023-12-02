package ru.job4j.tracker.item;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class ItemDescByName implements Comparator<Item> {
    @Override
    public int compare(Item one, Item two) {
        return two.getName().compareTo(one.getName());
    }
}
