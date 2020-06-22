package com.marcolino.thiago.util;

import java.util.stream.Stream;

public interface ObjectBuilder {

    <T> T build(Class<T> type);
    <T> Stream<T> build(Class<T> type, int size);
}
