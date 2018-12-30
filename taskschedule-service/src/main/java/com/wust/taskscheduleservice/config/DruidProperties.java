package com.wust.taskscheduleservice.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@Data
@PropertySource(value = "classpath:quartz.properties")
public class DruidProperties {

    @Value("${org.quartz.dataSource.qzDS.driver}")
    private String driverClass;

    @Value("${org.quartz.dataSource.qzDS.URL}")
    private String url;

    @Value("${org.quartz.dataSource.qzDS.user}")
    private String user;

    @Value("${org.quartz.dataSource.qzDS.password}")
    private String password;

    @Value("${org.quartz.dataSource.qzDS.maxConnections}")
    private int maxActive;
}
