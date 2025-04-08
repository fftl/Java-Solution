package dev.fftl.java_solution.parser.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.fftl.java_solution.parser.dto.LawSearch;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;

@Slf4j
class JacksonParserTest {

    @Test
    @DisplayName("jackson test")
    void jackson_parse_test() throws Exception {
        WebClient client = WebClient.builder().baseUrl("http://www.law.go.kr/DRF/lawSearch.do").build();

        String str = client.get()
                .uri("?OC=fftl0785&target=eflaw&type=json&nw=2&query=소방")
                .retrieve()
                .bodyToMono(String.class).block();

        log.info("str = {}", str);
    }
}