package com.avinash.QuizApp.Controller;

import com.avinash.QuizApp.Model.QuestionTable;
import com.avinash.QuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController
{
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<QuestionTable>> getAllQuestions()
    {
        return questionService.getAllQuestions();
//          return "Hi";
    }

    @GetMapping("category/{cat}")
    public ResponseEntity<List<QuestionTable>> getQuestionsByCategory(@PathVariable("cat") String category)
    {
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody QuestionTable question)
    {
        return questionService.addQuestion(question);
    }
}
