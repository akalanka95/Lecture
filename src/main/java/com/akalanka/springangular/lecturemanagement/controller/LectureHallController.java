package com.akalanka.springangular.lecturemanagement.controller;

import com.akalanka.springangular.lecturemanagement.dto.LectureHall;
import com.akalanka.springangular.lecturemanagement.dto.Time;
import com.akalanka.springangular.lecturemanagement.service.LectureHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "api/lectureHalls")
public class LectureHallController {
    @Autowired
    private LectureHallService lectureHallService;

    @GetMapping(value ={"","/"})
    public Iterable<LectureHall> listOfTimes(){ return  this.lectureHallService.list();}

    @PostMapping(value = "/save")
    public LectureHall saveTime(@RequestBody LectureHall lectureHall){ return this.lectureHallService.save(lectureHall); }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTime(@PathVariable Integer id){ this.lectureHallService.delete(id); }

    @GetMapping(value = "/find/{id}")
    public LectureHall timeFindById(@PathVariable Integer id){
        return this.lectureHallService.findById(id);
    }

}
