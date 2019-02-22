package com.wust.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wust.pojo.ImageInfo;
import com.wust.pojo.harbor.Image;
import com.wust.pojo.harbor.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Service
public class ImageService {

    @Value("${harbor.address}")
    private String harborUrl;

    @Autowired
    RestTemplate restTemplate;

    public void addImage(){}

    public void removeImageByNameAndTag(){}


    //根据project_name获取指定镜像仓库信息
    public List<ImageInfo> getImageInfoByProjectId(String project_name){
        List<ImageInfo> list = new LinkedList<>();
        ImageInfo imageInfo = new ImageInfo();

        //获取project_id
        int project_id = Integer.parseInt(JSONObject.parseObject(Objects.requireNonNull(JSONArray.parseArray(getProjectByProjectName(project_name))).getString(0)).getString("project_id"));
        List<Image> libraries = JSONArray.parseArray(getImageNamesByProjectId(project_id), Image.class);
        for (Image image : libraries) {
            List<Tag> tags = JSONArray.parseArray(getImageTagsByName(image.getName()), Tag.class);
            imageInfo.setTags(tags);
            imageInfo.setImage(image);
            list.add(imageInfo);
        }
        return list;
    }

    //获取所有镜像仓库信息
    public String getProjects(){
        String url = harborUrl + "/api/projects";
        return restTemplate.getForObject(url, String.class);
    }

    private String getProjectByProjectName(String project_name) {
        String url = harborUrl + "/api/projects?name={project_name}";
        return restTemplate.getForObject(url, String.class, project_name);
    }

    private String getImageNamesByProjectId(int project_id) {
        String url = harborUrl + "/api/repositories?project_id={project_id}";
        return restTemplate.getForObject(url, String.class, project_id);
    }

    private String getImageTagsByName(String repo_name) {
        String url = harborUrl + "/api/repositories/{repo_name}/tags";
        return restTemplate.getForObject(url, String.class, repo_name);
    }
}
