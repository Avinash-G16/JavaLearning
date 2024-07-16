package com.avinash.QuizApp.Service;

import com.avinash.QuizApp.Dao.QuestionDao;
import com.avinash.QuizApp.Model.QuestionTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService
{
    @Autowired
    QuestionDao questionDao;
    public ResponseEntity<List<QuestionTable>> getAllQuestions()
    {
        try{
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<QuestionTable>> getQuestionByCategory(String category)
    {
        try
        {
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(QuestionTable question)
    {
        if(!questionDao.existsById(question.getId())) {
            try
            {
                questionDao.save(question);
                return new ResponseEntity<>("Success", HttpStatus.CREATED);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        return new ResponseEntity<>("Failed", HttpStatus.FORBIDDEN);

    }
}
