package com.example.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationResponseTest {

    @Test
    void getMessage() {
        ValidationResponse v = new ValidationResponse();
        v.setMessage("{\"name\":\"iris\"}");
        Assertions.assertEquals("{\"name\":\"iris\"}", v.getMessage());
    }

}