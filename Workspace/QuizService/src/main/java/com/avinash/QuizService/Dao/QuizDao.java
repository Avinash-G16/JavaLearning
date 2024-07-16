package com.avinash.QuizService.Dao;

import com.avinash.QuizApp.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
