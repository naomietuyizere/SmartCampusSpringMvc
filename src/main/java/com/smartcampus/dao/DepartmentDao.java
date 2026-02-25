package com.smartcampus.dao;

import com.smartcampus.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DepartmentDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DepartmentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 1. READ: Fetch all departments from MySQL
    public List<Department> getAllDepartments() {
        String sql = "SELECT * FROM departments";
        return jdbcTemplate.query(sql, new RowMapper<Department>() {
            @Override
            public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Department(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("head_of_department"),
                        rs.getString("building")
                );
            }
        });
    }

    // 2. CREATE: Insert a new department into MySQL
    public void saveDepartment(Department department) {
        String sql = "INSERT INTO departments (name, head_of_department, building) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, department.getName(), department.getHeadOfDepartment(), department.getBuilding());
    }

    // 3. DELETE: Remove a department from MySQL
    public void deleteDepartment(int id) {
        String sql = "DELETE FROM departments WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}