package com.marcolino.thiago.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.marcolino.thiago.exception.MessageContentException;
import com.marcolino.thiago.util.JsonConverter;

public class JsonMessage implements PublishingMessage {

    private final String key;

    private final Object content;

    public JsonMessage(String key, Object content) {
        this.key = key;
        this.content = content;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getContent() throws MessageContentException {
        try {
            return JsonConverter.ToJson(content);
        } catch (JsonProcessingException ex) {
            throw new MessageContentException(ex);
        }
    }


}
