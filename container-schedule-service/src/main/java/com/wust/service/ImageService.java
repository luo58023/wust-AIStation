package com.wust.service;

import com.alibaba.fastjson.JSONArray;
import com.wust.pojo.ImageInfo;
import com.wust.pojo.harbor.Image;
import com.wust.pojo.harbor.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

@Service
public class ImageService {
    private static final int LIBRARY_PROJECT_ID = 3;
    @Value("${harbor.address}")
    private String harborUrl;

    @Autowired
    RestTemplate restTemplate;

    public void addImage(){}

    public void removeImageByNameAndTag(){}

    public List<ImageInfo> getImageInfoByProjectId(int id){
        List<ImageInfo> list = new LinkedList<>();
        ImageInfo imageInfo = new ImageInfo();
        int project_id = id > 0 ? id : LIBRARY_PROJECT_ID;
        List<Image> libraries = JSONArray.parseArray(getImageNamesByProjectId(project_id), Image.class);
        for (Image image : libraries) {
            List<Tag> tags = JSONArray.parseArray(getImageTagsByName(image.getName()), Tag.class);
            imageInfo.setTags(tags);
            imageInfo.setImage(image);
            list.add(imageInfo);
        }
        return list;
    }

    private String getImageNamesByProjectId(int project_id) {
        return restTemplate.getForObject(harborUrl + "/api/repositories?project_id={project_id}", String.class, project_id);
    }

    private String getImageTagsByName(String name) {
        return restTemplate.getForObject(harborUrl + "/api/repositories/" + name + "/tags", String.class);
    }
}
