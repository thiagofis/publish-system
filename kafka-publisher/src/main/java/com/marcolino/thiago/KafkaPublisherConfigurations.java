package com.marcolino.thiago;

import java.util.HashMap;

public class KafkaPublisherConfigurations extends HashMap<String, Object> implements Configurations {

    private final String topicName;

    public KafkaPublisherConfigurations(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public String getTopicName() {
        return topicName;
    }
}
