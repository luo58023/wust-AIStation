package com.wust.userservice.pojo.response;

import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class ResponseBody {

    private Object data;

    public ResponseBody() {
    }

    public ResponseBody(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
