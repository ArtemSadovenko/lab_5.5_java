package com.company;

import static com.company.Main.stupid_dobutok;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testStupid_dobutok() {
        int t = stupid_dobutok(2, 2);
        assertEquals(4, t);
    }
}