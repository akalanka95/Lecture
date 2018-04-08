package com.akalanka.springangular.lecturemanagement.controller;

import com.akalanka.springangular.lecturemanagement.dto.Course;
import com.akalanka.springangular.lecturemanagement.dto.Department;
import com.akalanka.springangular.lecturemanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value ={"","/"})
    public Iterable<Course> listOfTimes(){ return this.courseService.list();}

    @PostMapping(value = "/save")
    public Course saveTime(@RequestBody Course course){ return this.courseService.save(course); }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTime(@PathVariable Integer id){ this.courseService.delete(id); }

    @GetMapping(value = "/find/{id}")
    public Course timeFindById(@PathVariable Integer id){
        return this.courseService.findById(id);
    }

}
