package ru.job4j.tracker;

import java.util.Arrays;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
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
        return Arrays.copyOf(items, size);
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
        return Arrays.copyOf(names, count);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        if (id <= size) {
            int index = indexOf(id);
            items[index] = item;
            item.setId(id);
            return (id == item.getId());
        }
        return false;
    }

    public boolean delete(int id) {
        if (id <= size) {
            int index = indexOf(id);
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size] = null;
            size--;
            return items[size] == null;
        }
        return false;
    }

}

