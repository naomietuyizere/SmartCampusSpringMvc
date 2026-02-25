package com.smartcampus.dao;

import com.smartcampus.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CourseDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CourseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 1. READ: Fetch all courses from MySQL
    public List<Course> getAllCourses() {
        String sql = "SELECT * FROM courses";
        return jdbcTemplate.query(sql, new RowMapper<Course>() {
            @Override
            public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Course(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("code"),
                        rs.getInt("credits")
                );
            }
        });
    }

    // 2. CREATE: Insert a new course into MySQL
    public void saveCourse(Course course) {
        String sql = "INSERT INTO courses (name, code, credits) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, course.getName(), course.getCode(), course.getCredits());
    }

    // 3. DELETE: Remove a course from MySQL
    public void deleteCourse(int id) {
        String sql = "DELETE FROM courses WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}