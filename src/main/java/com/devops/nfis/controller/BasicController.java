package com.devops.nfis.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @PostMapping("/hello")
    public String hello() {
        return "Hello There";
    }

}
