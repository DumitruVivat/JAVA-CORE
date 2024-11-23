package org.example.dev.dumitru;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void add() {
        Cat cat = new Cat();
        Assertions.assertEquals(12, cat.add(5, 7));
    }

    @Test
    void add2() {
        Cat cat = new Cat();
        Assertions.assertEquals(-1, cat.add(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

//    @Test
//    void add3() {
//        Cat cat = new Cat();
//        Assertions.assertEquals(0, cat.add(Integer.MAX_VALUE, 1));
//    }

}