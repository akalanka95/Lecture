package com.akalanka.springangular.lecturemanagement.dao;

import com.akalanka.springangular.lecturemanagement.dto.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course,Integer> {
}
