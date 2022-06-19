package com.example.demo.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @OneToMany(targetEntity = Question.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "sq_fk", referencedColumnName = "id")
    private List<Question> questions;

}
