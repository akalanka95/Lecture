package com.akalanka.springangular.lecturemanagement.dao;

import com.akalanka.springangular.lecturemanagement.dto.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureDao extends JpaRepository<Lecture,Integer> {
}
