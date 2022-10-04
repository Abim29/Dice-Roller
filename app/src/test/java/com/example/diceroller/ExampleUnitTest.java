package com.example.diceroller;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void generates_number() {
        Dice dice = new Dice(6);
        int rollResult = dice.roll();
        int[] range = IntStream.range(1, 7).toArray();
        assertTrue("The value of rollResult was not between 1 and 6", IntStream.of(range).anyMatch(x -> x == rollResult));
    }
}