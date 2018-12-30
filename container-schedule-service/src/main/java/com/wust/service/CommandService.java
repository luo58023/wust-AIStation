package com.wust.service;

import com.alibaba.fastjson.JSONObject;
import com.wust.util.ExecuteUtil;
import org.springframework.stereotype.Service;

@Service
public class CommandService {
    public JSONObject delectContainerStatus(String podName){
        String scriptPath = getPath() + "/containerStatus.sh";
        JSONObject result = ExecuteUtil.doCommand(scriptPath + " " + podName);
        return result;
    }

    public String getPath(){
        String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
        char[] c = path.toCharArray();
        int count = 0;
        int site = c.length-1;
        int site1 = 0;
        int site2 = 0;
        String jarName = "/";
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
            jarName += c[site2];
        }
        int end = path.indexOf(jarName);
        path = path.substring(5, end) + "/script";
        return path;
    }
}
