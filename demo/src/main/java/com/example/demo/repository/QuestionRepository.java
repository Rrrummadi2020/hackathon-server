package com.example.demo.repository;

import com.example.demo.domains.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {

    @Query(value = "SELECT * FROM question q WHERE q.sq_fk = ?1 ",nativeQuery = true)
    public List<Question> getAllQuestionsForSubject(Long id);
}
