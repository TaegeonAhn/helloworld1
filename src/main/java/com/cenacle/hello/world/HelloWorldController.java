package com.cenacle.hello.world;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1")
public class HelloWorldController {
    private final HelloWorldService helloWorldService;

    @GetMapping("/{text}")
    public String get(@PathVariable String text) {
        var test = new Test();
        test.setText(text);

        return helloWorldService.get(test);
    }

    @Data
    class Test {
        private String text;

    }

}
