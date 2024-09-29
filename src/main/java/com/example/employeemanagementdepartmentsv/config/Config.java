package com.example.employeemanagementdepartmentsv.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    // creat bean for ModelMapper
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
