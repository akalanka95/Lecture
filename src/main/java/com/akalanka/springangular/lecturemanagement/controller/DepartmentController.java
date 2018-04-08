package com.akalanka.springangular.lecturemanagement.controller;

import com.akalanka.springangular.lecturemanagement.dto.Department;
import com.akalanka.springangular.lecturemanagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(value ={"","/"})
    public Iterable<Department> listOfTimes(){ return  this.departmentService.list();}

    @PostMapping(value = "/save")
    public Department saveTime(@RequestBody Department department){ return this.departmentService.save(department); }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTime(@PathVariable Integer id){ this.departmentService.delete(id); }

    @GetMapping(value = "/find/{id}")
    public Department timeFindById(@PathVariable Integer id){
        Department department = this.departmentService.findById(id);
        System.out.println("deparment details : " + department);
        return this.departmentService.findById(id);

    }

}
