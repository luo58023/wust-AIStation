package com.wust.userservice.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author ygtao
 */
@Service
public class TokenService {

    /**
     * 生成token
     * @return
     */
    public String generateToken() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
