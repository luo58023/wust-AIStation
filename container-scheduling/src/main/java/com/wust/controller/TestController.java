package com.wust.controller;

import com.wust.pojo.image.Library;
import com.wust.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    ImageService imageService;

    @GetMapping(value = "/test")
    public List<Library> test(){
        List<Library> libraries = imageService.getImageInfo();
        return libraries;
    }
}
