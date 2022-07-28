package com.example.springboot;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.google.gson.Gson;
import io.vertx.core.json.JsonObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/response")
public class ClientController {
    @RequestMapping(value = "/client",
            method = RequestMethod.POST,
            consumes = "text/plain",
            produces = "application/json")
    public void process(@RequestBody String payload) throws JsonParseException,
            IOException {
        System.out.println(payload);

        String jsonString = payload;
        //test string
        //String jsonString = "{\"createdBy\": \"iris\",\"title\": \"my birthday\",\"description\" : \"set up a reminder for my birthday\",\"reminderDateTime\": \"2022-09-09 00:00:00.000\",\"active\": \"true\"}";
        // way 1
//        JsonObject json = new JsonObject(payload);
//        System.out.println(json.getString("title"));

        // way 2
        ClientAccount client = null;
        Gson gson = new Gson();
        client = gson.fromJson(jsonString, ClientAccount.class);
        client.setCreatedDateTime();
        //System.out.println(client.getCreatedDateTime());
        String response = "You have created following event:" +
                "\n- title: " + client.getTitle()+
                "\n- description: " + client.getDescription()+
                "\n- createdBy: " + client.getCreatedBy()+
                "\n\t- reminderDateTime: "+client.getReminderDateTime()+
                "\n\t- createdDateTime: "+client.getCreatedDateTime();
        System.out.println(response);



//        way 3
//        ClientAccount client = null;
//        client = new ObjectMapper().readValue(jsonString, ClientAccount.class);
//        System.out.println(client.getCreatedBy());


        // pretty print
        // String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(client);

        // System.out.println(prettyStaff1);

        // curl -H "Accept: application/json" -H "Content-type: text/plain" -X POST -d '{"name":"value"}' http://localhost:8080/myservice/validate
        //'{ \
        //  "createdBy": "iris", \
        //  "title": "my birthday", \
        //  "description" : "set up a reminder for my birthday", \
        //  "reminderDateTime": "2022-09-09 00:00:00.000", \
        //  "active": true \
        //}'

        // "{\"createdBy\": \"iris\",\"title\": \"my birthday\",\"description\" : \"set up a reminder for my birthday\",\"reminderDateTime\": \"2022-09-09 00:00:00.000\",\"active\": \"true\"}";
        //curl -H "Accept: application/json" -H "Content-type: text/plain" -X POST -d "{\"createdBy\": \"iris\",\"title\": \"my birthday\",\"description\" : \"set up a reminder for my birthday\",\"reminderDateTime\": \"2022-09-09 00:00:00.000\",\"active\": \"true\"}" http://localhost:8080/response/client

//        You have created following event:
//        - title: my birthday
//        - description: set up a reminder for my birthday
//        - createdBy: iris
//                - reminderDateTime: 2022-09-09 00:00:00.000
//                - createdDateTime: 2022-xx-xx xx:xx:xx.000
    }

}
