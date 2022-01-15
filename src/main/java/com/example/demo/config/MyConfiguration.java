package com.example.demo.config;

import com.example.demo.beans.MyDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("mydatasource.properties")
public class MyConfiguration {

    @Bean
    public MyDatasource myDatasource(@Value("${datasource.username}") String username,
                                     @Value("${datasource.password}") String password) {
        MyDatasource myDatasource = new MyDatasource();
        myDatasource.setUsername(username);
        myDatasource.setPassword(password);
        System.out.println(myDatasource.getUsername() + "  :  " + myDatasource.getPassword());
        return myDatasource;
    }
}
