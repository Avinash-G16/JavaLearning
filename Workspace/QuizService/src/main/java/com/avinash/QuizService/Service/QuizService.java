package com.avinash.QuizService.Service;

import com.avinash.QuizApp.Dao.QuestionDao;
import com.avinash.QuizApp.Dao.QuizDao;
import com.avinash.QuizApp.Model.QuestionTable;
import com.avinash.QuizApp.Model.QuestionWrapper;
import com.avinash.QuizApp.Model.Quiz;
import com.avinash.QuizApp.Model.UserResponse;
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
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title)
    {
        List<QuestionTable> questions = questionDao.findRandomQuestionsByCategory(category, numQ);
        Quiz quiz = new Quiz();

        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id)
    {
        Optional <Quiz> quiz = quizDao.findById(id);
        List<QuestionTable> questionsFromDb = quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();
        for(QuestionTable q : questionsFromDb)
        {
            QuestionWrapper qw = new QuestionWrapper(q.getId(),q.getQuestiontitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionsForUser.add(qw);
        }
        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<UserResponse> response)
    {
        Quiz quiz = quizDao.findById(id).get();
        List<QuestionTable> questions = quiz.getQuestions();
        int right = 0;
        int i = 0;
        for(UserResponse res : response)
        {
            if(res.getResponse().equals(questions.get(i).getRightanswer()))
            {
                right++;
            }
            i++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
