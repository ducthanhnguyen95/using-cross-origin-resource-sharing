package com.example.using.cross.origin.resource.sharing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class MainController {

    private final Logger logger = Logger.getLogger(MainController.class.getName());

    @GetMapping("/")
    public String main() {
        return "main.html";
    }

    @PostMapping("/test")
    @ResponseBody
    @CrossOrigin("http://localhost:8080")
//    @CrossOrigin(value = "*", allowedHeaders = "*", methods = )
    public String test() {
        logger.info("Test method called");
        return "HELLO";
    }
}
