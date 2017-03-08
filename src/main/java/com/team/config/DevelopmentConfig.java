package com.team.config;

import com.team.backend.services.EmailService;
import com.team.backend.services.MockMailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by raghav on 9/3/17.
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/.Team/application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService(){
        return new MockMailService();
    }
}
