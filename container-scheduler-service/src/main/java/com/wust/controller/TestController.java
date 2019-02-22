package com.wust.controller;

import com.alibaba.fastjson.JSONObject;
import com.wust.annotation.JsonController;
import com.wust.pojo.PodInfo;
import com.wust.service.ContainerService;
import com.wust.service.ImageService;
import com.wust.util.K8sUrlInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@JsonController("/test")
public class TestController {

    @Value("${harbor.address}")
    private String harborUrl;

    @Autowired
    ImageService imageService;

    @Autowired
    ContainerService containerService;

    @GetMapping("/1")
    public ResponseEntity test1(HttpServletRequest request){
        String projects = imageService.getProjects();
        return ResponseEntity.ok(projects);
    }

    @GetMapping("/2")
    public Object test2(){
        PodInfo podInfo = new PodInfo();
        String json = JSONObject.toJSONString(podInfo);

        System.out.println(json);
        return json;
    }

    //创建测试
    @GetMapping("/3")
    public Object test3(){
        PodInfo podInfo = new PodInfo();

        String str1 = "{\"apiVersion\": \"apps/v1\",\"kind\": \"Deployment\",\"metadata\": { \"name\": \"nginx\","
                + "\"labels\": {\"app\": \"nginx\" } }, \"spec\": {\"replicas\": 1, \"selector\": {\"matchLabels\": { \"app\": \"nginx\" }"
                +"}, \"template\": {"+
                "\"metadata\": {"+
                "\"name\": \"nginx\","+
                "\"labels\": { \"app\": \"nginx\" } },"+
                "\"spec\": { \"containers\": [ {\"name\": \"nginx\", \"image\": \"10.10.10.101/library/nginx:latest\","+
                "\"imagePullPolicy\": \"IfNotPresent\" }],\"restartPolicy\": \"Always\"} } } }";
        System.out.println(JSONObject.toJSONString(JSONObject.parseObject(str1)));
        podInfo = JSONObject.parseObject(JSONObject.toJSONString(JSONObject.parseObject(str1)), PodInfo.class);



        System.out.println(JSONObject.parseObject(str1));
        String json = JSONObject.toJSONString(podInfo);


        String createUrl = K8sUrlInfo.getCreateUrl(JSONObject.parseObject(str1).getString("kind"));

        containerService.create(createUrl, JSONObject.parseObject(str1),"default");

        return json;
    }

    //删除测试
    @GetMapping("/4")
    public Object test4(){
        String deleteUrl= K8sUrlInfo.getUpdateUrl("Deployment");
        containerService.delete(deleteUrl,"default","nginx");
        return "ok";
    }


}
