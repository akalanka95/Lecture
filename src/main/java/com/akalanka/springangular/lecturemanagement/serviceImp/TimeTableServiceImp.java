package com.akalanka.springangular.lecturemanagement.serviceImp;

import com.akalanka.springangular.lecturemanagement.dao.TimeTableDao;
import com.akalanka.springangular.lecturemanagement.dto.Time;
import com.akalanka.springangular.lecturemanagement.dto.TimeTable;
import com.akalanka.springangular.lecturemanagement.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("timeTableService")
public class TimeTableServiceImp implements TimeTableService {
    @Autowired
    private TimeTableDao timeTableDao;

    @Override
    public Iterable<TimeTable> list() {
        return this.timeTableDao.findAll();
    }

    @Override
    public TimeTable save(TimeTable timeTable) {
        return this.timeTableDao.save(timeTable);
    }

    @Override
    public void delete(Integer id) {
        this.timeTableDao.deleteById(id);
    }

    @Override
    public TimeTable findById(Integer id) {
        Optional<TimeTable> timeTable = this.timeTableDao.findById(id);
        return timeTable.get();
    }

    @Override
    public Iterable<TimeTable> findCisTimeTable(Integer id) {
        return this.timeTableDao.findByDepartmentId(id);
    }

    @Override
    public Iterable<TimeTable> findTimeTableByDay(String day) {
        return this.timeTableDao.findByDay(day);
    }
}
