package com.ibo.test;

import com.ibo.pit.Calculate;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void add() {
        assertEquals(2,new Calculate().add(1,1));
    }

    @Test
    public void subtract() {
        assertEquals(1,new Calculate().subtract(2,1));
    }

    @Test
    public void multiply() {
        assertEquals(2,new Calculate().multiply(1,2));
    }

    @Test
    public void divide() {
        assertEquals(2,new Calculate().divide(4,2));
    }

    @Test
    public void summation() {
        assertEquals(3, new Calculate().summation(2));
    }

    @Test
    public void isPositive() {
        assertEquals(true, new Calculate().isPositive(2));
    }

    @Test
    public void compare() {
        assertEquals(-1, new Calculate().compare(-1,0));
    }
}