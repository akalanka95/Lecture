package com.akalanka.springangular.lecturemanagement.serviceImp;

import com.akalanka.springangular.lecturemanagement.dao.SemesterDao;
import com.akalanka.springangular.lecturemanagement.dto.Semester;
import com.akalanka.springangular.lecturemanagement.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("semesterService")
public class SemesterServiceImp implements SemesterService {
    @Autowired
    private SemesterDao semesterDao;

    @Override
    public Iterable<Semester> list() {
        return this.semesterDao.findAll();
    }

    @Override
    public Semester save(Semester semester) {
        return this.semesterDao.save(semester);
    }

    @Override
    public void delete(Integer id) {
        this.semesterDao.deleteById(id);
    }

    @Override
    public Semester findById(Integer id) {

        Optional<Semester> semester = this.semesterDao.findById(id);
        return semester.get();
    }
}
