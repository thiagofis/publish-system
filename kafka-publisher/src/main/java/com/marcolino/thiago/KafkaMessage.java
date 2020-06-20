package com.marcolino.thiago;

public class KafkaMessage implements Message {

    private final String key;

    private final String content;

    public KafkaMessage(String key, String content) {
        this.key = key;
        this.content = content;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getContent() {
        return content;
    }
}
