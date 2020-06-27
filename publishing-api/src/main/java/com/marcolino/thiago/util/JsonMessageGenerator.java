package com.marcolino.thiago.util;

import com.marcolino.thiago.message.JsonMessage;

import java.util.stream.IntStream;

public class JsonMessageGenerator {

    public static JsonMessage[] generate(int size) {
        return IntStream.range(1, size).mapToObj(index -> new JsonMessage("key" + index, "content" + index))
                                       .toArray(JsonMessage[]::new);
    }
}
