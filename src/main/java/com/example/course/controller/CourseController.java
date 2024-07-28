package com.example.course.controller;

import com.example.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/count/{courseName}")
    public int countStudentsInCourse(@PathVariable String courseName) {
        return courseService.countStudentsInCourse(courseName);
    }
}

