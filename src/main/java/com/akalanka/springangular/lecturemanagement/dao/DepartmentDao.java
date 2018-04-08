package com.akalanka.springangular.lecturemanagement.dao;

import com.akalanka.springangular.lecturemanagement.dto.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends JpaRepository<Department,Integer> {
}
