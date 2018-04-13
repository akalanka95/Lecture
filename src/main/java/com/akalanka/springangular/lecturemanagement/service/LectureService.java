package com.akalanka.springangular.lecturemanagement.service;

import com.akalanka.springangular.lecturemanagement.dto.Lecture;

import java.util.Optional;


public interface LectureService {
    Iterable<Lecture> list();
    Lecture save(Lecture lecture);
    void delete(Integer id);
    Lecture findById(Integer id);
    Lecture updateLecture(Lecture lecture);
}
