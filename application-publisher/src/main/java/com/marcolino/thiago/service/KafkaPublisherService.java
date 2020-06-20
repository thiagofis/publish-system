package com.marcolino.thiago.service;

import com.marcolino.thiago.Publisher;
import com.marcolino.thiago.message.PublishingMessage;

import java.util.Arrays;
import java.util.concurrent.Future;

public class KafkaPublisherService implements PublisherService {

    private final Publisher publisher;

    public KafkaPublisherService(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public Future<Void> publish(PublishingMessage ... messages) {
        Arrays.stream(messages).map(msg -> new KafkaMessage)
    }
}
