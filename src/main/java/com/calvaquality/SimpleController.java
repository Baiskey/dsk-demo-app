package com.calvaquality;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @CrossOrigin
    @GetMapping(value = "/")
    public String getHelloWorld() {
        return "Hello World, my friend";
    }
}
