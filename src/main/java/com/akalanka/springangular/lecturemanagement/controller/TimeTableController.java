package com.akalanka.springangular.lecturemanagement.controller;


import com.akalanka.springangular.lecturemanagement.dto.TimeTable;
import com.akalanka.springangular.lecturemanagement.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/timesTables")
public class TimeTableController {

    @Autowired
    private TimeTableService timeTableService;

    @GetMapping(value ={"","/"})
    public Iterable<TimeTable> listOfTimes(){ return  this.timeTableService.list();}

    @PostMapping(value = "/save")
    public TimeTable saveTime(@RequestBody TimeTable timeTable){ return this.timeTableService.save(timeTable); }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTime(@PathVariable Integer id){ this.timeTableService.delete(id); }

    @GetMapping(value = "/find/{id}")
    public TimeTable timeFindById(@PathVariable Integer id){
        return this.timeTableService.findById(id);
    }

    @GetMapping(value = "/{id}")
    public Iterable<TimeTable> cisTimeTable(@PathVariable Integer id){
        return this.timeTableService.findCisTimeTable(id);
    }

    @GetMapping(value = "findBy/{day}")
    public Iterable<TimeTable> timeTableByDay(@PathVariable String day){
        return this.timeTableService.findTimeTableByDay(day);
    }

}
