package com.smartcampus.service;

import com.smartcampus.dao.LecturerDao;
import com.smartcampus.model.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerService {

    private final LecturerDao lecturerDao;

    @Autowired
    public LecturerService(LecturerDao lecturerDao) {
        this.lecturerDao = lecturerDao;
    }

    public List<Lecturer> getAllLecturers() {
        return lecturerDao.getAllLecturers();
    }

    public void saveLecturer(Lecturer lecturer) {
        lecturerDao.saveLecturer(lecturer);
    }

    public void deleteLecturer(int id) {
        lecturerDao.deleteLecturer(id);
    }
}