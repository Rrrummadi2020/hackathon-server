package com.example.demo.resources;

import com.example.demo.domains.Subject;
import com.example.demo.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class SubjectResource {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjects")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @DeleteMapping("/subjects/{id}")
    public String getOneSubject(@PathVariable Long id) {
        return subjectService.deleteById(id);
    }

    @GetMapping("/subjects/{id}")
    public Subject deleteById(@PathVariable Long id) {
        return subjectService.getOneSubject(id);
    }

    @PostMapping("/subjects")
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.createSubject(subject);
    }

    @PutMapping("/subjects")
    public Subject updateSubject(@RequestBody Subject subject) {
        return subjectService.updateSubject(subject);
    }
}
