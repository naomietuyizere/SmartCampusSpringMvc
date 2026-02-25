package com.smartcampus.controller;

import com.smartcampus.model.Student;
import com.smartcampus.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    // Injecting the Service Layer instead of using a fake list
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String listStudents(Model model) {
        // Fetch real data from the database!
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "student-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        // Save to the actual database!
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("id") int id) {
        // Delete from the actual database!
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}