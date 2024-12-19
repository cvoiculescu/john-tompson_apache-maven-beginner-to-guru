package org.voiculescu.mavenspringbootdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController()
public class ExampleController {

    @GetMapping("/")
    public Map<String, Object> getIndex() {
        HashMap<String, Object> returnValue = new HashMap<>();
        returnValue.put("hello", "world");
        return returnValue;
    }
}
