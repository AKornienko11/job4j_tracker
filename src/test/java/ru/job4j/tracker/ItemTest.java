package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.item.ItemAscByName;
import ru.job4j.tracker.item.ItemDescByName;


import java.util.List;
import java.util.Collections;


import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {

    @Test
    public void whenItemAscByName() {
        List<Item> items = Arrays.asList(new Item("ghi"),
                new Item("abc"),
                new Item("jkl"),
                new Item("def")
        );
        List<Item> expected = Arrays.asList(new Item("abc"),
                new Item("def"),
                new Item("ghi"),
                new Item("jkl")
        );

        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);

    }

    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(new Item("ghi"),
                new Item("abc"),
                new Item("jkl"),
                new Item("def")
        );
        List<Item> expected = Arrays.asList(new Item("jkl"),
        new Item("ghi"),
        new Item("def"),
        new Item("abc")
        );

        items.sort(new ItemDescByName());
        assertThat(items).isEqualTo(expected);

    }

}