package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestServiceTest {
    @Test
    public void testCalculate1() {
        RestService service = new RestService();

        int actual = service.calculate(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testCalculate2() {
    RestService service = new RestService();

    int actual = service.calculate(100_000, 60_000, 150_000);
    int expected = 2;

    Assertions.assertEquals(expected,actual);
}}
