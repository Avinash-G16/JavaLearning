package com.avinash.QuizApp.Dao;

import com.avinash.QuizApp.Model.QuestionTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<QuestionTable, Integer>
{
    List<QuestionTable> findByCategory(String category);

    @Query(value="select * from question_table q where q.category=:category order by RANDOM() LIMIT :numQ",nativeQuery = true
    )
    List<QuestionTable> findRandomQuestionsByCategory(String category, int numQ);
}