package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(monthSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumSales(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowAvgSales() {
        StatsService service = new StatsService();

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.avgSales(monthSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldShowBelowAwgSales() {
        StatsService service = new StatsService();

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAwgSales(monthSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldShowAboveAwgSales() {
        StatsService service = new StatsService();

        long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.aboveAwgSales(monthSales);

        assertEquals(expected, actual);

    }
}