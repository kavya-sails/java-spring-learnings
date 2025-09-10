package com.learnings.springLearnings.controller;

import com.learnings.springLearnings.records.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> index() {
        return Arrays.asList(new Course(1,"DevOps","codingClub"), new Course(2,"DSA","eazyCoding"));
    }

    @GetMapping(path = "/test",params = "version=1")
    public String something(){
        return "something";
    }
}
