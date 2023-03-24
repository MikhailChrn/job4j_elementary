package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To3Then3() {
        int a1 = 2;
        int a2 = 2;
        int a3 = 3;
        int result = Max.max(a1, a2, a3);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3To4To3Then4() {
        int b1 = 3;
        int b2 = 3;
        int b3 = 4;
        int b4 = 3;
        int result = Max.max(b1, b2, b3, b4);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}
