package com.example.springneo4jdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Autowired
    DataSourceProperties dataSourceProperties;
}