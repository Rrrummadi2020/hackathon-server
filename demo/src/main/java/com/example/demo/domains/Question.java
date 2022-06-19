package com.example.demo.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "answer", nullable = false)
    private String answer;

    @OneToMany(targetEntity = Choice.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "qo_fk", referencedColumnName = "id")
    private List<Choice> choices;



}
