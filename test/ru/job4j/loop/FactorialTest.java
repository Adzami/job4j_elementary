package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Assert.assertEquals(Factorial.calc(5), 120);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Assert.assertEquals(Factorial.calc(0), 1);
    }
}