package com.wust.controller;

import com.wust.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Value("${harbor.address}")
    private String harborUrl;

    @Autowired
    ImageService imageService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/test")

    public String test(){
        return restTemplate.getForObject(harborUrl + "/api/repositories", String.class);
    }
}
