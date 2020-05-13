package com.cenacle.hello.world;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String get(HelloWorldController.Test test) {
        return "hello world - " + test.getText();
    }
}
