package com.wust.service;

import com.alibaba.fastjson.JSONObject;
import com.wust.pojo.PodInfo;
import com.wust.pojo.kubernetes.Spec;
import com.wust.pojo.kubernetes.Spec1;
import com.wust.pojo.kubernetes.Template;
import com.wust.util.K8sUrlInfo;
import com.wust.vo.TicketInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ContainerService {
    private static final String DEFAULT_NAMESPACE = "default";

    @Autowired
    RestTemplate restTemplate;

    @Value("${kubernetes.address}")
    private String kubernetesUrl;

    //创建容器
    public void createContainer(TicketInfo ticketInfo){
        String namespace = ticketInfo.getNamespace() != null ? ticketInfo.getNamespace() : DEFAULT_NAMESPACE;
        PodInfo podInfo = new PodInfo();
        Spec1 spec1 = new Spec1();
        spec1.setNodeSelector("scheduler: cpu");
        Template template = new Template();
        template.setSpec(spec1);
        Spec spec = new Spec();
        spec.setTemplate(template);
        podInfo.setSpec(spec);
        //pojo对象怎么传值？
        //怎么传入自定义json对象

        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(podInfo));

        create(K8sUrlInfo.getCreateUrl(podInfo.getKind()), jsonObject, namespace );
    }


    //创建
    public void create(String createUrl, Object object, String namespace){
        String url = kubernetesUrl + createUrl;
        restTemplate.postForObject(url, object, String.class, namespace);
    }

    //更新
    public void apply(String updateUrl, Object object, String namespace, String name){
        String url = kubernetesUrl + updateUrl;
        restTemplate.patchForObject(url, object, String.class, namespace, name);
    }

    //删除
    public void delete(String deleteUrl, String namespace, String name){
        String url = kubernetesUrl + deleteUrl;
        System.out.println(url);
        restTemplate.delete(url, namespace, name);
    }


}
