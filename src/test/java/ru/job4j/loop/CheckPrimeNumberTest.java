package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when3() {
        int number = 3;
        boolean result = CheckPrimeNumber.check(number);
        Assert.assertTrue(result);
    }
}