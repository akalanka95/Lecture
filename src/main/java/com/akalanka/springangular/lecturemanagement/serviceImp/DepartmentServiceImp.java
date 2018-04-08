package com.akalanka.springangular.lecturemanagement.serviceImp;

import com.akalanka.springangular.lecturemanagement.dao.DepartmentDao;
import com.akalanka.springangular.lecturemanagement.dto.Department;
import com.akalanka.springangular.lecturemanagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("departmentService")
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public Iterable<Department> list() {
        return this.departmentDao.findAll();
    }

    @Override
    public Department save(Department department) {
        return this.departmentDao.save(department);
    }

    @Override
    public void delete(Integer id) {
        this.departmentDao.deleteById(id);
    }

    @Override
    public Department findById(Integer id)
    {
        Optional<Department> department = this.departmentDao.findById(id);
        return department.get();
    }
}
