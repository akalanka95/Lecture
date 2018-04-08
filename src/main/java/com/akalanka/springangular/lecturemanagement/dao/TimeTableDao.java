package com.akalanka.springangular.lecturemanagement.dao;

import com.akalanka.springangular.lecturemanagement.dto.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableDao extends JpaRepository<TimeTable,Integer> {
    Iterable<TimeTable> findByDepartmentId(@Param("id") Integer id);
    Iterable<TimeTable> findByDay(@Param("day") String day);
}
