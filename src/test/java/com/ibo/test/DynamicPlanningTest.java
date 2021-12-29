package com.ibo.test;

import com.ibo.pit.DynamicPlanning;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DynamicPlanningTest {

    @Test
    public void getFib() {
        assertEquals(144, DynamicPlanning.getFib(12));
    }

    @Test
    public void getFibByDP() {
        assertEquals(144, DynamicPlanning.getFibByDP(12));
    }

    @Test
    public void getFibByDP1() {
        assertEquals(144, DynamicPlanning.getFibByDP1(new int[12], 12));
    }
}