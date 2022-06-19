package com.example.demo.services;

import com.example.demo.domains.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
        @Autowired
        private StudentRepository studentRepository;
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student updateStudent(Student student){
        return studentRepository.saveAndFlush(student);
    }
    public Student getById(Long id){
        return studentRepository.findById(id).get();
    }

    public Student createStudent(Student student){
        return studentRepository.saveAndFlush(student);
    }


}
