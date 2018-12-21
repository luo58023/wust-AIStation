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
            int exitcode = proc.waitFor();
            System.out.println("exitcode = "+ exitcode);
            result.put("exitcode", exitcode);
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
