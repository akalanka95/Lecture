package com.akalanka.springangular.lecturemanagement.serviceImp;

import com.akalanka.springangular.lecturemanagement.dao.DepartmentRefDao;
import com.akalanka.springangular.lecturemanagement.dto.DepartmentRef;
import com.akalanka.springangular.lecturemanagement.service.DepartmentRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("departmentRefService")
public class DepartmentRefImp implements DepartmentRefService {
    @Autowired
    private DepartmentRefDao departmentRefDao;
    @Override
    public Iterable<DepartmentRef> list() {
        return this.departmentRefDao.findAll();
    }

    @Override
    public DepartmentRef save(DepartmentRef departmentRef) {
        return this.departmentRefDao.save(departmentRef);
    }

    @Override
    public void delete(Integer id) {
        this.departmentRefDao.deleteById(id);
    }

    @Override
    public DepartmentRef findById(Integer id) {
        Optional<DepartmentRef> departmentRef = this.departmentRefDao.findById(id);
        return departmentRef.get();
    }
}
