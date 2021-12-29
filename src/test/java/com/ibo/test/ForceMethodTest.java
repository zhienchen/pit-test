package com.ibo.test;

import com.ibo.pit.ForceMethod;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForceMethodTest {

    @Test
    public void getChicken() {
        assertEquals(8, ForceMethod.getChicken());
    }

    @Test
    public void getMinDist() {
        assertEquals(1, ForceMethod.getMinDist(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 8));
    }

    @Test
    public void getMaxSum() {
        assertEquals(44, ForceMethod.getMaxSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 8));
    }
}