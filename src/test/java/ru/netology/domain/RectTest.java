package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectTest {

    @Test
    void square() {
        Rect r1=new Rect();
        r1.setCoords(0,0,-10, -20);
       int s1=r1.square();
        assertEquals(200, s1);

    }
}