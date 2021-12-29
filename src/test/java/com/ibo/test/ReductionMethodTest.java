package com.ibo.test;

import com.ibo.pit.ReductionMethod;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReductionMethodTest {

    @Test
    public void decreaseSum() {
        assertEquals(20, ReductionMethod.decreaseSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1, 5));
    }

    @Test
    public void decreaseSearch() {
        assertEquals(3, ReductionMethod.decreaseSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1, 5, 4));
    }
}