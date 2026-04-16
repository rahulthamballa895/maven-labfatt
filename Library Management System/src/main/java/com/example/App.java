package com.example;

public class App {

    public int calculateFine(int days) {
        int allowed = 7;

        if (days > allowed) {
            return (days - allowed) * 10;
        }
        return 0;
    }
}
