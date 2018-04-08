package com.akalanka.springangular.lecturemanagement.service;

import com.akalanka.springangular.lecturemanagement.dto.Department;
import com.akalanka.springangular.lecturemanagement.dto.Time;

import java.util.Optional;

public interface DepartmentService {
    Iterable<Department> list();
    Department save(Department department);
    void delete(Integer id);
    Department findById(Integer id);
}
