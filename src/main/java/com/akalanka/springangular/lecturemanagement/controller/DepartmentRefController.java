package com.akalanka.springangular.lecturemanagement.controller;

import com.akalanka.springangular.lecturemanagement.dto.Department;
import com.akalanka.springangular.lecturemanagement.dto.DepartmentRef;
import com.akalanka.springangular.lecturemanagement.service.DepartmentRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "api/departmentRefs")
public class DepartmentRefController {
    @Autowired
    private DepartmentRefService departmentRefService;

    @GetMapping(value ={"","/"})
    public Iterable<DepartmentRef> listOfTimes(){ return  this.departmentRefService.list();}

    @PostMapping(value = "/save")
    public DepartmentRef saveTime(@RequestBody DepartmentRef departmentRef){ return this.departmentRefService.save(departmentRef); }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTime(@PathVariable Integer id){ this.departmentRefService.delete(id); }

    @GetMapping(value = "/find/{id}")
    public DepartmentRef timeFindById(@PathVariable Integer id){
          return this.departmentRefService.findById(id);

    }

}
