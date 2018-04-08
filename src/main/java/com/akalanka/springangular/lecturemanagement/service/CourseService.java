package com.akalanka.springangular.lecturemanagement.service;

import com.akalanka.springangular.lecturemanagement.dto.Course;
import com.akalanka.springangular.lecturemanagement.dto.Department;

import java.util.Optional;

public interface CourseService {
    Iterable<Course> list();
    Course save(Course course);
    void delete(Integer id);
    Course findById(Integer id);
}
