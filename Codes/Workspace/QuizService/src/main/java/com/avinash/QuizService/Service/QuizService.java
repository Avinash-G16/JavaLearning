package com.avinash.QuizService.Service;
import com.avinash.QuizService.Dao.QuizDao;
import com.avinash.QuizService.Feign.QuizInterface;
import com.avinash.QuizService.Model.QuestionWrapper;
import com.avinash.QuizService.Model.Quiz;
import com.avinash.QuizService.Model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService
{
    @Autowired
    QuizDao quizDao;

    @Autowired
    QuizInterface quizInterface;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title)
    {
        List<Integer> questions = quizInterface.getQuestionsForQuiz(category, numQ).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id)
    {

        Quiz quiz = quizDao.findById(id).get();
        List<Integer> questionId = quiz.getQuestions();
        ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromId(questionId);
        return questions;
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<UserResponse> response)
    {
        ResponseEntity<Integer> score = quizInterface.getScore(response);
        return score;
    }
}
