package com.example.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestBody;

class JsonValidationControllerTest {

    @Test
    ValidationResponse process(@RequestBody String payload) {
        String JsonExample = new String("{\"name\":\"iris\"}");
        ValidationResponse response = new ValidationResponse();
        boolean retValue = false;
        retValue = Validator.isValid(payload);
        Assertions.assertEquals("Invalid JSON",process(JsonExample));
        return response;
    }
}