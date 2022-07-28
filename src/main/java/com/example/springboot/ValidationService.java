//package com.example.springboot;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
//@RestController
//@RequestMapping("/myservice")
//public class ValidationService {
//    @RequestMapping(value="/validate", method = RequestMethod.POST)
//    public void validate(@RequestBody Map<String, Object> payload) throws Exception {
//        Gson gson = new Gson();
//        String json = gson.toJson(payload);
//        System.out.println(json);
//        boolean retValue = false;
//        try {
//            retValue = Validator.isValid(json);
//        }
//        catch(Throwable t) {
//            t.printStackTrace();
//        }
//        System.out.println(retValue);
//    }
//}

//----------------------------------------
//@RestController
//@RequestMapping("/myservice")
//public class ValidationService {
//@RequestMapping(value="/validate",
//        method = RequestMethod.POST,
//        consumes="text/plain",
//        produces="application/json")
//public ValidationResponse process(@RequestBody String payload) throws JsonParseException,
//        IOException {
//    ValidationResponse response = new ValidationResponse();
//    boolean retValue = false;
//    retValue = Validator.isValid(payload);
//    System.out.println(retValue);
//    if (retValue == false) {
//        response.setMessage("Invalid JSON");
//    } else {
//        response.setMessage("Valid JSON");
//    }
//    return response;
//}
//}