package com.akalanka.springangular.lecturemanagement.controller;

import com.akalanka.springangular.lecturemanagement.dto.Time;
import com.akalanka.springangular.lecturemanagement.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "api/times")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping(value ={"","/"})
    public Iterable<Time> listOfTimes(){ return  this.timeService.list();}

    @PostMapping(value = "/save")
    public Time saveTime(@RequestBody Time time){ return this.timeService.save(time); }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTime(@PathVariable Integer id){ this.timeService.delete(id); }

    @GetMapping(value = "/find/{id}")
    public Time timeFindById(@PathVariable Integer id){
        return this.timeService.findById(id);
    }

}
