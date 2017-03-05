package com.team.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Created by raghav on 6/3/17.
 */
@Configuration
public class i18nConfig {
    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename("classpath:i18n/messages");
        /* to check the message file in every 3 sec */
        resourceBundleMessageSource.setCacheSeconds(180);
        return resourceBundleMessageSource;

    }
}
