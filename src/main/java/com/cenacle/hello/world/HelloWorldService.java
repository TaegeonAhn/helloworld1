package com.cenacle.hello.world;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String get(String text) {
        return "hello world - " + text;
    }
}
