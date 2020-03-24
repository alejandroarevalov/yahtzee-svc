package com.avala.yahtzee.config;

import com.avala.yahtzee.service.YahtzeeService;
import com.avala.yahtzee.service.YahtzeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AppConfig {

    @Bean
    public YahtzeeService yahtzeeService() {
        return new YahtzeeServiceImpl();
    }
}
