package com.marcolino.thiago.service;

import com.marcolino.thiago.message.PublishingMessage;
import java.util.concurrent.Future;

public interface PublisherService {
  Future<Void> publish(PublishingMessage... messages);
}
