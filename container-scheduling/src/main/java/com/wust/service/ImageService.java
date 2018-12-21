package com.wust.service;

import com.wust.pojo.image.Library;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ImageService {
    private static final int LIBRARY_PROJECT_ID=3;

    public void addImage(){}

    public void removeImageByNameAndTag(){}

    public List<Library> getImageInfo(){
        getImageNamesByProjectId();
        getImageTagsByName();
        RestTemplate restTemplate = new RestTemplate();
        List<Library> libraries = restTemplate.getForObject("http://202.114.252.2/api/repositories?project_id=3", List.class);
        return libraries;
    }

    private void getImageNamesByProjectId() {

    }

    private void getImageTagsByName() {
    }
}
