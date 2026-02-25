package com.smartcampus.dao;

import com.smartcampus.model.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class LecturerDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public LecturerDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 1. READ: Fetch all lecturers from MySQL
    public List<Lecturer> getAllLecturers() {
        String sql = "SELECT * FROM lecturers";
        return jdbcTemplate.query(sql, new RowMapper<Lecturer>() {
            @Override
            public Lecturer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Lecturer(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("specialization")
                );
            }
        });
    }

    // 2. CREATE: Insert a new lecturer into MySQL
    public void saveLecturer(Lecturer lecturer) {
        String sql = "INSERT INTO lecturers (name, email, specialization) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, lecturer.getName(), lecturer.getEmail(), lecturer.getSpecialization());
    }

    // 3. DELETE: Remove a lecturer from MySQL
    public void deleteLecturer(int id) {
        String sql = "DELETE FROM lecturers WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}