package com.example.demo.resources;

import com.example.demo.domains.Question;
import com.example.demo.domains.Subject;
import com.example.demo.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class QuestionResource {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/questions/{subjectId}")
    public List<Question> getAllQuestionsForSubject(@PathVariable Long subjectId) {
        return questionService.getAllQuestions(subjectId);
    }

    @PutMapping("/questions")
    public Question updateQuestion(@RequestBody Question question) {
        return questionService.updateQuestion(question);
    }

    @GetMapping("/question/{questionId}")
    public Question getOneQuestion(@PathVariable Long questionId) {
        return questionService.getOneQuestion(questionId);
    }

    @PostMapping("/questions/{subjectId}")
    public Subject createQuestion(@PathVariable Long subjectId, @RequestBody Question question) {
        return questionService.createQuestion(subjectId, question);
    }

    @DeleteMapping("/questions/{questionId}")
    public String deleteQuestion(@PathVariable Long questionId) {
        return questionService.deleteQuestion(questionId);
    }
}
