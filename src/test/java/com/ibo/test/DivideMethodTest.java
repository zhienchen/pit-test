package com.ibo.test;

import com.ibo.pit.DivideMethod;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideMethodTest {

    @Test
    public void divideSum() {
        assertEquals(14, DivideMethod.divideSum(new int[]{1, 2, 3, 4, 5}, 1, 4));
    }

    @Test
    public void divideMinDist() {
        assertEquals(1, DivideMethod.divideMinDist(new int[]{1, 2, 3, 4, 5}, 1, 4));
    }

    @Test
    public void divideMaxSum() {
        assertEquals(15, DivideMethod.divideMaxSum(new int[]{1, 2, 3, 4, 5}, 1, 4));
    }
}