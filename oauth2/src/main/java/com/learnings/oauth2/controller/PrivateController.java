package com.learnings.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @RequestMapping("/info")
    public String info() {
        return "Sample Private Info";
    }
}
