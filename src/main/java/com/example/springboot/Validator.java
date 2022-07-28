package com.example.springboot;
//
//import java.io.IOException;
//import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//public class Validator {
//    public static boolean isValid(String json) {
//        boolean retValue = false;
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY);
//            JsonParser parser = objectMapper.getFactory().createParser(json);
//            while (parser.nextToken() != null) {}
//            retValue = true;
//            objectMapper.readTree(json);
//        }catch(JsonParseException jpe) {
//            jpe.printStackTrace();
//        }
//        catch(IOException ioe) {
//        }
//        return retValue;
//    }
//}
//---------------------------------
import java.io.IOException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Validator {
    public static boolean isValid(String json) {
        boolean retValue = true;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY);
            JsonFactory factory = mapper.getFactory();
            JsonParser parser = factory.createParser(json);
            JsonNode jsonObj = mapper.readTree(parser);
            //System.out.println(jsonObj.toString());
        }
        catch(JsonParseException jpe) {
            retValue = false;
        }
        catch(IOException ioe) {
            retValue = false;
        }
        return retValue;
    }
}

