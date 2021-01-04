package com.example.mango.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String homeMethod() {
        logger.info("This is from Mango app controller");
        return "This is Tasty Mango App";
    }
}
