package com.techlabs.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techlabs.demo.Entity.Computer;
import com.techlabs.demo.Entity.HardDisk;

@Configuration
public class ApplicationConfig {
    
    @Bean
    public Computer getComputer() {
        return new Computer(); 
    }
    
    @Bean
    public HardDisk getHardDisk() {
        return new HardDisk();  
    }
}
