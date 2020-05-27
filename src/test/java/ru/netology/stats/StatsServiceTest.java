package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSumSales() {
        long expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMediumSale() {
        long expected = 15;
        long actual = service.calculateMedium(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthOfMaxSale() {
        long expected = 8;
        long actual = service.findMaxMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthOfMinSale() {
        long expected = 9;
        long actual = service.findMinMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthsOfSaleUnderMedium() {
        long expected = 5;
        long actual = service.underMediumMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthsOfSaleOverMedium() {
        long expected = 5;
        long actual = service.overMediumMonth(sales);
        assertEquals(expected, actual);
    }
}