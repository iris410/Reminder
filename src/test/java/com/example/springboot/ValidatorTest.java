package com.example.springboot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void isValid() {
        boolean val;
        String JsonExample = new String("{\"name\":\"iris\"}");
        Validator validator = new Validator();
        val = Validator.isValid(JsonExample);
        assertEquals(true,val);
    }

    @Test
    void isValid1() {
        boolean val;
        String JsonExample = new String("{\"name\":\"iris\"");
        Validator validator = new Validator();
        val = Validator.isValid(JsonExample);
        assertFalse(val);
    }
}