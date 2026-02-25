package com.smartcampus.service;

import com.smartcampus.dao.StudentDao;
import com.smartcampus.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public void saveStudent(Student student) {
        // You could add business logic here (e.g., check if email exists before saving)
        studentDao.saveStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }
}