package com.example.client.service;

import com.example.client.dto.Req;
import com.example.client.dto.UserRequest;
import com.example.client.dto.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@Slf4j
public class RestTemplateService {

    public UserResponse hello() {

        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/hello")
                .queryParam("name", "steve")
                .queryParam("age", 100)
                .encode()
                .build()
                .toUri();

        System.out.println(uri);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);

        log.info(result.getStatusCode().toString());
        log.info(result.getBody().toString());

        return result.getBody();
    }

    public UserResponse post() {

        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand("100", "steve")
                .toUri();
        log.info(uri.toString());

        UserRequest req = new UserRequest();
        req.setName("steve");
        req.setAge(10);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> result = restTemplate.postForEntity(uri, req, UserResponse.class);

        log.info(result.getStatusCode().toString());
        log.info(result.getHeaders().toString());
        log.info(result.getBody().toString());

        return result.getBody();
    }

    public UserResponse exchange() {

        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand("100", "steve")
                .toUri();
        log.info(uri.toString());

        UserRequest req = new UserRequest();
        req.setName("steve");
        req.setAge(10);

        RequestEntity<UserRequest> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "abcd")
                .header("custom-header", "aaa")
                .body(req);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.exchange(requestEntity, UserResponse.class);
        log.info(response.getStatusCode().toString());
        log.info(response.getHeaders().toString());
        log.info(response.getBody().toString());

        return response.getBody();
    }

    public Req<UserResponse> genericExchange() {

        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand("100", "steve")
                .toUri();
        log.info(uri.toString());

        UserRequest userRequest = new UserRequest();
        userRequest.setName("steve");
        userRequest.setAge(10);

        Req req = new Req(new Req.Header(), userRequest);

        RequestEntity<Req<UserRequest>> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "abcd")
                .header("custom-header", "aaa")
                .body(req);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Req<UserResponse>> response = restTemplate.exchange(requestEntity, new ParameterizedTypeReference<>() {
        });
        log.info(response.getStatusCode().toString());
        log.info(response.getHeaders().toString());
        log.info(response.getBody().toString());

        return response.getBody();
    }
}
