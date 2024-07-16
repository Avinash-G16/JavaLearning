package com.avinash.QuizService.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Quiz
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @ManyToMany
    private List<QuestionTable> questions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<QuestionTable> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionTable> questions) {
        this.questions = questions;
    }
}
