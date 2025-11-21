package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whena0b1c2Thenc() {
        int a = 0;
        int b = 1;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 2;
        assertThat(expected).isEqualTo(result);

    }

    @Test
    public void whena0b1c2d1Thena() {
        int a = 20;
        int b = 11;
        int c = 12;
        int d = 3;
        int result = Max.max(a, b, c, d);
        int expected = 20;
        assertThat(expected).isEqualTo(result);
    }
}