package com.smartcampus.controller;

import com.smartcampus.model.Department;
import com.smartcampus.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    // Injecting the Service Layer!
    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public String listDepartments(Model model) {
        // Fetch from MySQL
        List<Department> departments = departmentService.getAllDepartments();
        model.addAttribute("departments", departments);
        return "department-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("department", new Department());
        return "department-form";
    }

    @PostMapping("/save")
    public String saveDepartment(@ModelAttribute("department") Department department) {
        // Save to MySQL
        departmentService.saveDepartment(department);
        return "redirect:/departments";
    }

    @GetMapping("/delete")
    public String deleteDepartment(@RequestParam("id") int id) {
        // Delete from MySQL
        departmentService.deleteDepartment(id);
        return "redirect:/departments";
    }
}