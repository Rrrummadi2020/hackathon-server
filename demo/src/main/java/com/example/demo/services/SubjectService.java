package com.example.demo.services;

import com.example.demo.domains.Subject;
import com.example.demo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject getOneSubject(Long id) {
        return subjectRepository.findById(id).get();
    }

    public String deleteById(Long id) {
        subjectRepository.deleteById(id);
        return "successfully created";
    }

    public  Subject createSubject(Subject subject){
        return subjectRepository.saveAndFlush(subject);
    }

    public Subject updateSubject(Subject subject){
        Subject subject1 = getOneSubject(subject.getId());
        subject1.setName(subject.getName());
        subject1.setDescription(subject.getDescription());
        return subjectRepository.saveAndFlush(subject1);
    }

}
