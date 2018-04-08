package com.akalanka.springangular.lecturemanagement.controller;

import com.akalanka.springangular.lecturemanagement.dto.Department;
import com.akalanka.springangular.lecturemanagement.dto.Lecture;
import com.akalanka.springangular.lecturemanagement.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "api/lectures")
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @GetMapping(value ={"","/"})
    public Iterable<Lecture> listOfTimes(){ return  this.lectureService.list();}

    @PostMapping(value = "/save")
    public Lecture saveTime(@RequestBody Lecture lecture){ return this.lectureService.save(lecture); }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTime(@PathVariable Integer id){ this.lectureService.delete(id); }

    @GetMapping(value = "/find/{id}")
    public Lecture timeFindById(@PathVariable Integer id){
        System.out.println(this.lectureService.findById(1).getDepartment().getDepartmentName());
        return this.lectureService.findById(id);
    }

}
