package com.example.coverage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/info")
    public String info() {
        return "Service is running";
    }

    @GetMapping("/oldest-student")
    public Student getOldestStudent() {
        return studentService.getOldestStudent();
    }
}
