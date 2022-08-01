package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("--------------");

        var objectMapper = new ObjectMapper();

        var user = new User("minji", 10, "010-1234-1234");

        // object -> text
        // object mapper : get method 활용
        // 이때 getter가 아닌 함수에 get을 붙이면 에러 발생
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        //text -> object
        // object mapper : 기본생성자 필요로 함
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }

}
