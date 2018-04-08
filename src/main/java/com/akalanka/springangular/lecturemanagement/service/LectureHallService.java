package com.akalanka.springangular.lecturemanagement.service;

import com.akalanka.springangular.lecturemanagement.dto.LectureHall;
import com.akalanka.springangular.lecturemanagement.dto.Time;

import java.util.Optional;

public interface LectureHallService {
    Iterable<LectureHall> list();
    LectureHall save(LectureHall lectureHall);
    void delete(Integer id);
    LectureHall findById(Integer id);
}
