package dev.fftl.java_solution.parser.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.fftl.java_solution.parser.Statute;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.*;
import java.io.IOException;


import static org.junit.jupiter.api.Assertions.*;

class JacksonParserTest {


    JsonFactory jsonFactory = new JsonFactory();
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    @DisplayName("jackson test")
    void jackson_parse_test() throws Exception {
        WebClient webClient = WebClient.builder().baseUrl("https://www.law.go.kr/DRF/lawSearch.do?OC=fftl0785&target=eflaw&query=소방&efYd=20250402~20991231&type=json").build();
        String xmlData = webClient.get().retrieve().bodyToMono(String.class).block();

        objectMapper.readValue(xmlData, Statute.class);
//        System.out.println(xmlData);
        JsonParser jsonParser;
        {
            try {
                jsonParser = jsonFactory.createParser(xmlData);
                System.out.println(jsonParser.nextToken());;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}