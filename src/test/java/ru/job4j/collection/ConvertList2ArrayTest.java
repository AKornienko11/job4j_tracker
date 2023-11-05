package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        int[][] array = ConvertList2Array.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expected = new int[][]{{1, 2, 3},
                                       {4, 5, 6},
                                       {7, 0, 0}
        };
        assertThat(array).isDeepEqualTo(expected);
    }

    @Test
    public void when5ElementsThen6() {
        int[][] array = ConvertList2Array.toArray(Arrays.asList(1, 2, 3, 4, 5), 2);
        int[][] expected = new int[][]{{1, 2},
                                       {3, 4},
                                       {5, 0}
        };
        assertThat(array).isDeepEqualTo(expected);

    }
}