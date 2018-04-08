package com.akalanka.springangular.lecturemanagement.serviceImp;

import com.akalanka.springangular.lecturemanagement.dao.TimeDao;
import com.akalanka.springangular.lecturemanagement.dto.Time;
import com.akalanka.springangular.lecturemanagement.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("timeService")
public class TimeServiceImp implements TimeService{

    @Autowired
    private TimeDao timeDao;

    @Override
    public Iterable<Time> list() {
        return this.timeDao.findAll();
    }

    @Override
    public Time save(Time time) {
        return this.timeDao.save(time);
    }

    @Override
    public void delete(Integer id) {
        this.timeDao.deleteById(id);
    }

    @Override
    public Time findById(Integer id)
    {
        Optional<Time> time = this.timeDao.findById(id);
        return time.get();
    }
}
