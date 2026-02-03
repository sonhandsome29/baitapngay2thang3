package com.example.sondeptraidemo.controller;


import com.example.sondeptraidemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String index() {
        return "index";
    }

    @GetMapping("/demo")
    public String demoPage(Model model) {
        // Tạo đối tượng Student
        Student student = new Student("Nguyễn Văn A", "Welcome Thymeleaf!");

        // Thêm student vào model
        model.addAttribute("student", student);
        model.addAttribute("message", "Welcome Thymeleaf!");

        return "demo";
    }
}