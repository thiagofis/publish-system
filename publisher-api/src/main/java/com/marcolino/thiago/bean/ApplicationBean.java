package com.marcolino.thiago.bean;

import com.marcolino.thiago.setting.ApplicationSettings;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApplicationSettings.class)
public class ApplicationBean {

    private final ApplicationSettings applicationSettings;

    public ApplicationBean(ApplicationSettings applicationSettings) {
        this.applicationSettings = applicationSettings;
    }

}
