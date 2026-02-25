package com.smartcampus.service;

import com.smartcampus.dao.CourseDao;
import com.smartcampus.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseDao courseDao;

    @Autowired
    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }

    public void saveCourse(Course course) {
        courseDao.saveCourse(course);
    }

    public void deleteCourse(int id) {
        courseDao.deleteCourse(id);
    }
}