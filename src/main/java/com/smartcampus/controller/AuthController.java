package com.smartcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    // 1. Redirect root to Login
    @GetMapping("/")
    public String root() {
        return "redirect:/login";
    }

    // 2. Show Login Page
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    // 3. Process Login (Dummy check for speed)
    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               Model model) {
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "redirect:/dashboard";
        }
        model.addAttribute("error", "Invalid credentials. Try admin / admin123");
        return "login";
    }

    // 4. Show Register Page
    @GetMapping("/register")
    public String showRegister() {
        return "register";
    }

    // 5. Show Dashboard (The Hub)
    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }
}