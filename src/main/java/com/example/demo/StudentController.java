package com.example.demo;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/students")
public class StudentController {
    
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository repository) {
        this.studentRepository = repository;
    }

    public List<Student> getAllStudents() { 
        return studentRepository.findAll();
    }
}