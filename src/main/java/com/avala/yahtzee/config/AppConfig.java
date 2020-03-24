package com.avala.yahtzee.config;

import com.avala.yahtzee.service.YahtzeeService;
import com.avala.yahtzee.service.YahtzeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public YahtzeeService yahtzeeService() {
        return new YahtzeeServiceImpl();
    }
}
