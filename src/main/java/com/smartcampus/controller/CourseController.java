package com.smartcampus.controller;

import com.smartcampus.model.Course;
import com.smartcampus.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    // Injecting the Service Layer!
    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public String listCourses(Model model) {
        // Fetch from MySQL
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("courses", courses);
        return "course-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("course", new Course());
        return "course-form";
    }

    @PostMapping("/save")
    public String saveCourse(@ModelAttribute("course") Course course) {
        // Save to MySQL
        courseService.saveCourse(course);
        return "redirect:/courses";
    }

    @GetMapping("/delete")
    public String deleteCourse(@RequestParam("id") int id) {
        // Delete from MySQL
        courseService.deleteCourse(id);
        return "redirect:/courses";
    }
}