package com.marcolino.thiago;

import java.io.Closeable;

public interface Publisher extends Closeable {
    void publish(Message message);
}
