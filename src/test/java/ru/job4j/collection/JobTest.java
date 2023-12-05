package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class JobTest {

    @Test
    public void whenIncByName() {
        Comparator<Job> cmpNamePriority = new JobIncByName();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenIncByPriority() {
        Comparator<Job> cmpNamePriority = new JobIncByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenDecByName() {
        Comparator<Job> cmpNamePriority = new JobDecByName();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenDecByPriority() {
        Comparator<Job> cmpNamePriority = new JobDecByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenDecByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDecByName().thenComparing(new JobDecByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)

        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenDecByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDecByPriority().thenComparing(new JobDecByName());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 1)

        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenIncByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobIncByName().thenComparing(new JobIncByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)

        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenIncByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobIncByPriority().thenComparing(new JobIncByName());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 1)

        );
        assertThat(rsl).isLessThan(0);
    }

}
