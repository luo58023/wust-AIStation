package com.wust.taskscheduleservice.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author ygtao
 */
@Data
@PropertySource(value = "classpath:quartz.properties")
@ConfigurationProperties(prefix = "org.quartz.datasource.druids")
@Component
public class DruidProperties {

    private String driver;

    private String url;

    private String username;

    private String password;

    private int maxConnections;
}
