package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthsOfRestTests {

    /*------------------------- Обычные тесты для Задания 1 - обязательного ------------------------------------------*/
    @Test
    public void shouldCalcExactTwo() {
        MonthsOfRest service = new MonthsOfRest();

        int expected = 2;
        int actual = service.monthsOfRest(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactThree() {
        MonthsOfRest service = new MonthsOfRest();

        int expected = 3;
        int actual = service.monthsOfRest(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
}