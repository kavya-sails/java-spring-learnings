package com.learnings.springLearnings.controller;

import com.learnings.springLearnings.config.CourseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigurationsController {

    @Autowired
    private CourseConfiguration courseConfiguration;

    @RequestMapping("/configs")
    public CourseConfiguration configs() {
        return courseConfiguration;
    }
}
