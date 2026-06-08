package com.example.demo.SampleTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    void SampleTest1(){
        int price1 = 10;
        int price2 = 20;
        int result = price1 + price2;
        assertEquals(30, result);
    }
}
