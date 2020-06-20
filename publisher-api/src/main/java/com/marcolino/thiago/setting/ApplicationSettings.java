package com.marcolino.thiago.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "settings")
public class ApplicationSettings {

    private String topicName;
    private Map<String, Object> publisherProperties;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Map<String, Object> getPublisherProperties() {
        return publisherProperties;
    }

    public void setSettings(Map<String, Object> publisherProperties) {
        this.publisherProperties = publisherProperties;
    }
}
