package com.akalanka.springangular.lecturemanagement.service;

import com.akalanka.springangular.lecturemanagement.dto.Time;
import com.akalanka.springangular.lecturemanagement.dto.TimeTable;

public interface TimeTableService {
    Iterable<TimeTable> list();
    TimeTable save(TimeTable timeTable);
    void delete(Integer id);
    TimeTable findById(Integer id);
    Iterable<TimeTable> findCisTimeTable(Integer id);
    Iterable<TimeTable> findTimeTableByDay(String day);
}
