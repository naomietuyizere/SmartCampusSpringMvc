package com.smartcampus.controller;

import com.smartcampus.model.Lecturer;
import com.smartcampus.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/lecturers")
public class LecturerController {

    private final LecturerService lecturerService;

    // Injecting the Service Layer!
    @Autowired
    public LecturerController(LecturerService lecturerService) {
        this.lecturerService = lecturerService;
    }

    @GetMapping
    public String listLecturers(Model model) {
        // Fetch from MySQL
        List<Lecturer> lecturers = lecturerService.getAllLecturers();
        model.addAttribute("lecturers", lecturers);
        return "lecturer-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("lecturer", new Lecturer());
        return "lecturer-form";
    }

    @PostMapping("/save")
    public String saveLecturer(@ModelAttribute("lecturer") Lecturer lecturer) {
        // Save to MySQL
        lecturerService.saveLecturer(lecturer);
        return "redirect:/lecturers";
    }

    @GetMapping("/delete")
    public String deleteLecturer(@RequestParam("id") int id) {
        // Delete from MySQL
        lecturerService.deleteLecturer(id);
        return "redirect:/lecturers";
    }
}