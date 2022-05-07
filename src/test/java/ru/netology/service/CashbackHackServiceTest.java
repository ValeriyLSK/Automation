package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculate() {
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateBoundary() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateBoundaryTwo() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateBoundaryThree() {
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldFail() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}