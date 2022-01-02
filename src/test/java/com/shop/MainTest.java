package com.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    @Test
    void sum() {
        int result = Main.sum(2, 2);

        assertEquals(4, result);
    }
}