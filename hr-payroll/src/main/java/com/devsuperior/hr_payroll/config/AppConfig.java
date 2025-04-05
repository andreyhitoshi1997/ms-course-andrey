package com.devsuperior.hr_payroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    //Instância única (Singleton)
    //Crianod um componente usando o método usando o @Bean
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
