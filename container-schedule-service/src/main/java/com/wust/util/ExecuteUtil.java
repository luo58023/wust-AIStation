package com.wust.util;

import com.alibaba.fastjson.JSONObject;

public class ExecuteUtil {

    public ExecuteUtil() {
    }

    public static JSONObject doCommand(String cmd) {
        JSONObject result = new JSONObject();
        String[] cmdArray = new String[]{"/bin/sh", "-c", cmd};
        Process proc = null;
        try {
            proc = Runtime.getRuntime().exec(cmdArray);
            int exitCode = proc.waitFor();
            System.out.println("exitCode = "+ exitCode);
            result.put("exitCode", exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (proc != null) {
                proc.destroy();
            }
        }
        return result;
    }
}
