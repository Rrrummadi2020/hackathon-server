package com.example.demo.resources;

import com.example.demo.domains.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class StudentResource {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getALlStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getOneStudent(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @PutMapping("/students")
    public Student updateStudent(Student student) {
        return studentService.updateStudent(student);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}
