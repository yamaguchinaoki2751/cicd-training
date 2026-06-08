package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    @Test
    void SampleTest1(){
        int price1 = 10;
        int price2 = 1;
        int result = price1 + price2;
        assertEquals(11, result);
    }
}
