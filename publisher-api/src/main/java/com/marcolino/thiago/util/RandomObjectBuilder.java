package com.marcolino.thiago.util;

import org.jeasy.random.EasyRandom;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class RandomObjectBuilder implements ObjectBuilder{

    private final EasyRandom generator;

    public RandomObjectBuilder(EasyRandom generator) {
        this.generator = generator;
    }

    @Override
    public <T> T build(Class<T> type) {
        return generator.nextObject(type);
    }

    @Override
    public <T> Stream<T> build(Class<T> type, int size) {
        return generator.objects(type, size);
    }
}
