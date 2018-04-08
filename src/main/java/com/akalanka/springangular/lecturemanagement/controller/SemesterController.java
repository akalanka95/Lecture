package com.akalanka.springangular.lecturemanagement.controller;

import com.akalanka.springangular.lecturemanagement.dto.Semester;
import com.akalanka.springangular.lecturemanagement.dto.Time;
import com.akalanka.springangular.lecturemanagement.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "api/semesters")
public class SemesterController {
    @Autowired
    private SemesterService semesterService;

    @GetMapping(value ={"","/"})
    public Iterable<Semester> listOfTimes(){ return  this.semesterService.list();}

    @PostMapping(value = "/save")
    public Semester saveTime(@RequestBody Semester semester){ return this.semesterService.save(semester); }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTime(@PathVariable Integer id){ this.semesterService.delete(id); }

    @GetMapping(value = "/find/{id}")
    public Semester timeFindById(@PathVariable Integer id){
        return this.semesterService.findById(id);
    }

}
