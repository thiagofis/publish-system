package com.marcolino.thiago;

import java.util.HashMap;
import java.util.Map;

public class KafkaPublisherPublisherConfigurations extends HashMap<String, Object> implements PublisherConfigurations {

    private final String topicName;

    public KafkaPublisherPublisherConfigurations(String topicName, Map<String, Object> properties) {
        this.topicName = topicName;
        this.putAll(properties);
    }

    @Override
    public String getTopicName() {
        return topicName;
    }
}
