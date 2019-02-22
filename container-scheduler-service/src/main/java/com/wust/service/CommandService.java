package com.wust.service;

import com.alibaba.fastjson.JSONObject;
import com.wust.util.ExecuteUtil;
import org.springframework.stereotype.Service;

@Service
public class CommandService {
    //轮询pod的status
    public JSONObject detectPodStatus(String namespace,String podName){
        String scriptPath = getPath() + "/PodStatus.sh";
        return ExecuteUtil.doCommand(scriptPath + " " + namespace + " " + podName);
    }

    private String getPath(){
        String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
        char[] c = path.toCharArray();
        int count = 0;
        int site = c.length-1;
        int site1 = 0;
        int site2 = 0;
        StringBuilder jarName = new StringBuilder("/");
        for (; site>0; site--){
            if (c[site] == '/'){
                count++;
                if (count == 3){
                    site1 = site - 1;
                }
                if (count == 4){
                    site2 = site + 1;
                    break;
                }
            }
        }
        for (; site2<=site1; site2++){
            jarName.append(c[site2]);
        }
        int end = path.indexOf(jarName.toString());
        return path.substring(5, end) + "/script";
    }
}
