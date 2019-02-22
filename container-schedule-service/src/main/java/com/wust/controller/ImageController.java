package com.wust.controller;

import com.wust.annotation.JsonController;
import com.wust.pojo.ImageInfo;
import com.wust.pojo.response.ResponseBuilder;
import com.wust.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@JsonController("/docker")
public class ImageController {
    private static final String DEFAULT_PROJECT_NAME="library"; //默认访问仓库

    @Autowired
    ImageService imageService;

    //获取镜像信息
    @GetMapping(value = "/imageInfos")
    public ResponseEntity getImages(HttpServletRequest request) {
        String projectName = request.getParameter("project_name");
        if (projectName == null || projectName.equals("")) {
            projectName = DEFAULT_PROJECT_NAME;
        }
        System.out.println(projectName);
        List<ImageInfo> images = imageService.getImageInfoByProjectId(projectName);
        if (images != null){
            //System.out.println(images);
            return ResponseBuilder.ok(images);
        }else {
            return ResponseBuilder.notFound();
        }
    }

}
