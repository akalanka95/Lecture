package com.akalanka.springangular.lecturemanagement.service;

import com.akalanka.springangular.lecturemanagement.dto.Department;
import com.akalanka.springangular.lecturemanagement.dto.DepartmentRef;

import java.util.Optional;

public interface DepartmentRefService {
    Iterable<DepartmentRef> list();
    DepartmentRef save(DepartmentRef departmentRef);
    void delete(Integer id);
    DepartmentRef findById(Integer id);
}
