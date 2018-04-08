package com.akalanka.springangular.lecturemanagement.serviceImp;

import com.akalanka.springangular.lecturemanagement.dao.LectureHallDao;
import com.akalanka.springangular.lecturemanagement.dto.Lecture;
import com.akalanka.springangular.lecturemanagement.dto.LectureHall;
import com.akalanka.springangular.lecturemanagement.service.LectureHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("lectureHallService")
public class LectureHallServiceImp implements LectureHallService {
    @Autowired
    private LectureHallDao lectureHallDao;

    @Override
    public Iterable<LectureHall> list() {
        return this.lectureHallDao.findAll();
    }

    @Override
    public LectureHall save(LectureHall lectureHall) {
        return this.lectureHallDao.save(lectureHall);
    }

    @Override
    public void delete(Integer id) {
        this.lectureHallDao.deleteById(id);
    }

    @Override
    public LectureHall findById(Integer id) {

        Optional<LectureHall> lectureHall =  this.lectureHallDao.findById(id);
        return lectureHall.get();
    }
}
