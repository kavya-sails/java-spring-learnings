package com.learnings.springLearnings.hateoas;

import com.learnings.springLearnings.model.Person;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

//HATEOAS - Hyper Media as the engine of application state

@RestController
public class CourseHateoasController {

    @GetMapping("/courses")
    public List<Person> findAllCourses(){
        return List.of(new Person("kavya","namballa")
                ,new Person("sai","bharadwaj"));
    }

    @GetMapping("/getRandom")
    public EntityModel<Person> getRandomCourse(){
        return EntityModel.of(new Person("kavya","namballa"),
                linkTo(methodOn(this.getClass()).findAllCourses()).withRel("find-all-courses"));
    }
}
