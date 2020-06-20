package com.marcolino.thiago;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisher implements Publisher {

    private final Producer<String, String> producer;
    private final String topic;

    @Autowired
    public KafkaPublisher(Configurations configurations) {
        this.producer = new KafkaProducer<>(configurations);
        this.topic = configurations.getTopicName();
    }

    @Override
    public void publish(Message message) {
        var record = new ProducerRecord<>(topic, message.getKey(), message.getContent());
        producer.send(record);
    }
}
