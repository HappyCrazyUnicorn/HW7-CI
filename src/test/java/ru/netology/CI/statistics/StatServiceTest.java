package ru.netology.CI.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatServiceTest {

    @Test
    void findMax() {
        StatService service = new StatService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    void findMaxFirst() {
        StatService service = new StatService();

        long[] incomesInBillions2 = {3,2,1};
        long expected = 3;

        long actual = service.findMax(incomesInBillions2);

        assertEquals(expected, actual);
    }
    void findMaxLast() {
        StatService service = new StatService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 122};
        long expected = 122;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    void findMaxEquals() {
        StatService service = new StatService();

        long[] incomesInBillions2 = {12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions2);

        assertEquals(expected, actual);
    }
    void findMaxMiddle() {
        StatService service = new StatService();

        long[] incomesInBillions2 = {12, 5, 8, 4, 5, 3, 18, 6, 11, 11, 12};
        long expected = 18;

        long actual = service.findMax(incomesInBillions2);

        assertEquals(expected, actual);
    }
}