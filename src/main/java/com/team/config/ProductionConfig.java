package com.team.config;

import com.team.backend.services.EmailService;
import com.team.backend.services.SmtpMailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by raghav on 9/3/17.
 */
@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/.Team/application-prod.properties")
public class ProductionConfig {


    @Bean
    public EmailService emailService() {
        return new SmtpMailService();
    }
}
