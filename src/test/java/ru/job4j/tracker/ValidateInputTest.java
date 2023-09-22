package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"one", "1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenAllValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"1", "2", "3"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        int selected1 = input.askInt("Enter menu");
        int selected2 = input.askInt("Enter menu");
        assertThat(selected).isEqualTo(1);
        assertThat(selected1).isEqualTo(2);
        assertThat(selected2).isEqualTo(3);
    }

    @Test
    void whenAllValidMinusInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"-1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected).isEqualTo(-1);

    }

}




