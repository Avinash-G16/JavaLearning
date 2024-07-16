package com.avinash.QuestionService.Controller;
import com.avinash.QuestionService.Model.QuestionTable;
import com.avinash.QuestionService.Model.QuestionWrapper;
import com.avinash.QuestionService.Model.UserResponse;
import com.avinash.QuestionService.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
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


    //FOR QUIZ COMMUNICATION

    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz
            (@RequestParam String category, @RequestParam Integer numQuestions)
    {
        return questionService.getQuestionsForQuiz(category, numQuestions);
    }

    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds)
    {
        return questionService.getQuestionsFromId(questionIds);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<UserResponse> responses)
    {
        return questionService.getScore(responses);
    }

}
