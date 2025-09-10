package com.learning.springboot.learnjpaandhibernate.course;

import com.learning.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.learning.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

//	@Autowired
//	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn java","Coding Club"));
//		repository.save(new Course(1, "Learn Spring", "techHub"));
//		repository.save(new Course(2, "Learn from Kavya", "techHub"));
//		repository.save(new Course(3, "Tech Basics with Kavya", "techHub"));
//
//		repository.deleteById(1l);
//
//		System.out.println(repository.findById(2l));
//		System.out.println(repository.findById(3l));
//
//		System.out.println(repository.findAll());
//		System.out.println(repository.count());
//
//		System.out.println(repository.findByAuthor("techHub"));
//		System.out.println(repository.findByAuthor(""));
//
//		System.out.println(repository.findByName("Learn Kavya"));
//		System.out.println(repository.findByName("Tech Basics with Kavya -"));

		
	}

}
