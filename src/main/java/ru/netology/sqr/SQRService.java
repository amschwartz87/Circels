package ru.netology.sqr;

public class SQRService {
    public int quantitySQR(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                counter++;
            }
        }
        return counter;
    }
}