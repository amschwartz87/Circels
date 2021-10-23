package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldQuantitySQR() {
        SQRService service = new SQRService();

        int expected = 3;

        int actual = service.quantitySQR(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldQuantitySQRUnderLowerLimit() {
        SQRService service = new SQRService();

        int expected = 8;

        int actual = service.quantitySQR(100, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldQuantitySQROverLowerLimit() {
        SQRService service = new SQRService();

        int expected = 2;

        int actual = service.quantitySQR(250, 300);
        assertEquals(expected, actual);
    }
    @Test
    void shouldQuantitySQROverUpperLimit() {
        SQRService service = new SQRService();

        int expected = 6;

        int actual = service.quantitySQR(200, 400);
        assertEquals(expected, actual);
    }
    @Test
    void shouldQuantitySQROUnderUpperLimit() {
        SQRService service = new SQRService();

        int expected = 1;

        int actual = service.quantitySQR(200, 250);
        assertEquals(expected, actual);
    }
}

