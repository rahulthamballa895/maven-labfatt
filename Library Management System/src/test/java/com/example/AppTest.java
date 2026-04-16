package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testFine() {
        App app = new App();
        assertEquals(30, app.calculateFine(10));
    }
}
