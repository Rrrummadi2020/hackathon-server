package com.example.demo.services;

import com.example.demo.domains.Question;
import com.example.demo.domains.Subject;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.repository.SubjectRepository;
import com.example.demo.resources.SubjectResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private SubjectService subjectService;

    public List<Question> getAllQuestions(Long subjectId){
        return questionRepository.getAllQuestionsForSubject(subjectId);
    }

    public Question updateQuestion(Question question){
        return questionRepository.save(question);
    }

    public Question getOneQuestion(Long questionId){
        return questionRepository.findById(questionId).get();
    }
    public Subject createQuestion(Long subjectId,Question question ){
        //get the subject ,
        //add the question to object
        //save to db
        Subject subject = subjectService.getOneSubject(subjectId);
        subject.getQuestions().add(question);
        return subjectService.updateSubject(subject);

    }

    public String deleteQuestion(Long questionId){
        questionRepository.deleteById(questionId);
        return "Question deleted SuccessFully witj id "+questionId;
    }

}
