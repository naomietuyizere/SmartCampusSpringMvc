package com.smartcampus.service;

import com.smartcampus.dao.DepartmentDao;
import com.smartcampus.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentDao departmentDao;

    @Autowired
    public DepartmentService(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }

    public void saveDepartment(Department department) {
        departmentDao.saveDepartment(department);
    }

    public void deleteDepartment(int id) {
        departmentDao.deleteDepartment(id);
    }
}