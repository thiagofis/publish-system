package com.marcolino.thiago.controller;

import com.marcolino.thiago.message.JsonMessage;
import com.marcolino.thiago.service.PublisherService;
import com.marcolino.thiago.util.JsonMessageGenerator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @PostMapping(path = "/single")
    public void single(String key, String content) {
        var message = new JsonMessage(key, content);
        publisherService.publish(message);
    }

    @PostMapping(path = "/many")
    public void many(int amount) {
        var messages = JsonMessageGenerator.generate(amount);
        publisherService.publish(messages);
    }
}
