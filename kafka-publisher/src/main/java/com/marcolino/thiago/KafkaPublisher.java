package com.marcolino.thiago;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.time.Duration;

public class KafkaPublisher implements Publisher {

    private final Producer<String, String> producer;
    private final String topic;
    private final Duration closeDuration;

    public KafkaPublisher(Configurations configurations) {
        this.producer = new KafkaProducer<>(configurations);
        this.topic = configurations.getTopic();
        this.closeDuration = configurations.getCloseDuration();
    }

    @Override
    public void publish(Message message) {
        var record = new ProducerRecord<>(topic, message.getKey(), message.getContent());
        producer.send(record);
    }

    @Override
    public void close() {
        producer.close(closeDuration);
    }
}
