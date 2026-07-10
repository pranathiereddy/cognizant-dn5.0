package com.cognizant.greet_service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetController.class);

    @GetMapping("/greet")
    public String sayHello() {
        LOGGER.info("START");
        return "Hello World!!";
    }
}
