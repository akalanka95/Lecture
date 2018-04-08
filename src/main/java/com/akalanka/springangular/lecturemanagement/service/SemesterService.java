package com.akalanka.springangular.lecturemanagement.service;

import com.akalanka.springangular.lecturemanagement.dto.Semester;
import com.akalanka.springangular.lecturemanagement.dto.Time;

import java.util.Optional;

public interface SemesterService {
    Iterable<Semester> list();
    Semester save(Semester semester);
    void delete(Integer id);
    Semester findById(Integer id);
}
