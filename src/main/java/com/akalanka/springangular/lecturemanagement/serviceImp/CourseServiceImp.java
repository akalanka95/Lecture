package com.akalanka.springangular.lecturemanagement.serviceImp;

import com.akalanka.springangular.lecturemanagement.dao.CourseDao;
import com.akalanka.springangular.lecturemanagement.dto.Course;
import com.akalanka.springangular.lecturemanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("courseService")
public class CourseServiceImp implements CourseService {
    @Autowired
    private CourseDao courseDao;

    @Override
    public Iterable<Course> list() {
        return this.courseDao.findAll();
    }

    @Override
    public Course save(Course course) {
        return this.courseDao.save(course);
    }

    @Override
    public void delete(Integer id) {
        this.courseDao.deleteById(id);
    }

    @Override
    public Course findById(Integer id) {
        Optional<Course> course = this.courseDao.findById(id);
        return course.get();
    }
}
