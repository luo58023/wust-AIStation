package com.wust.controller;

import com.wust.pojo.ResponseBuilder;
import com.wust.pojo.ImageInfo;
import com.wust.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ImageController {

    @Autowired
    ImageService imageService;

    @GetMapping(value = "/images")
    public ResponseEntity getImages(@RequestParam("project_id")int projectId){
        List<ImageInfo> images = imageService.getImageInfoByProjectId(projectId);
        if (images != null){
            return ResponseBuilder.ok(images);
        }else {
            return ResponseBuilder.badRequest();
        }
    }

}
