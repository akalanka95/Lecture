package com.akalanka.springangular.lecturemanagement.serviceImp;

import com.akalanka.springangular.lecturemanagement.dao.LectureDao;
import com.akalanka.springangular.lecturemanagement.dto.Lecture;
import com.akalanka.springangular.lecturemanagement.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("lectureService")
public class LectureServiceImp implements LectureService {
    @Autowired
    private LectureDao lectureDao;

    @Override
    public Iterable<Lecture> list() {
        return this.lectureDao.findAll();
    }

    @Override
    public Lecture save(Lecture lecture) {
        return this.lectureDao.save(lecture);
    }

    @Override
    public void delete(Integer id) {
        this.lectureDao.deleteById(id);
    }

    @Override
    public Lecture findById(Integer id) {
        Optional<Lecture> lecture =  this.lectureDao.findById(id);
        return  lecture.get();

    }

    @Override
    public Lecture updateLecture(Lecture lecture) {
        return this.lectureDao.save(lecture);
    }
}
