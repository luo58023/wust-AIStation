package com.wust.taskscheduleservice.quartz;

import com.alibaba.druid.pool.DruidDataSource;
import org.quartz.utils.ConnectionProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.Connection;
import java.sql.SQLException;


public class DruidConnectionProvider implements ConnectionProvider {

    @Autowired
    @Qualifier(value = "druidds")
    private DruidDataSource dataSource;


    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    @Override
    public void shutdown() throws SQLException {
        dataSource.close();
    }

    @Override
    public void initialize() throws SQLException {

    }
}
