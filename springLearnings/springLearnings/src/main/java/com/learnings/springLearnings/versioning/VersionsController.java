package com.learnings.springLearnings.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionsController {

    @GetMapping(path = "/person",params = "version=1")
    public String version1(){
        return "version1";
    }

    @GetMapping(path = "/person",params = "version=2")
    public String version2(){
        return "version2";
    }
}
