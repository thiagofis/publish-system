package com.marcolino.thiago.service;

import com.marcolino.thiago.KafkaMessage;
import com.marcolino.thiago.Publisher;
import com.marcolino.thiago.message.PublishingMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
public class KafkaPublisherService implements PublisherService {

    private final Publisher publisher;

    @Autowired
    public KafkaPublisherService(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public Future<Void> publish(PublishingMessage ... messages) {
        Runnable task = () -> {
            Arrays.stream(messages)
                  .map(msg -> new KafkaMessage(msg.getKey(), msg.getContent()))
                  .forEach(msg -> publisher.publish(msg));
        };

        return CompletableFuture.runAsync(task);
    }
}
