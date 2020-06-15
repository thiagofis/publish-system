package com.marcolino.thiago;

import java.time.Duration;
import java.util.Map;

public interface Configurations extends Map<String, Object> {
    String getTopic();
    Duration getCloseDuration();
}
