package com.avinash.QuestionService.Service;
import com.avinash.QuestionService.Dao.QuestionDao;
import com.avinash.QuestionService.Model.QuestionTable;
import com.avinash.QuestionService.Model.QuestionWrapper;
import com.avinash.QuestionService.Model.UserResponse;
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

    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String category, Integer numQuestions)
    {
        List<Integer> questions = questionDao.findRandomQuestionsByCategory(category, numQuestions);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
        List<QuestionWrapper> wrappers = new ArrayList<>();
        List<QuestionTable> questions = new ArrayList<>();
        for (Integer id : questionIds)
        {
            questions.add(questionDao.findById(id).get());
        }
        for(QuestionTable q : questions)
        {
            QuestionWrapper qw = new QuestionWrapper();
            qw.setId(q.getId());
            qw.setQuestiontitle((q.getQuestiontitle()));
            qw.setOption1(q.getOption1());
            qw.setOption2(q.getOption2());
            qw.setOption3(q.getOption3());
            qw.setOption4(q.getOption4());
            wrappers.add(qw);
        }
        return new ResponseEntity<>(wrappers, HttpStatus.OK);
    }

    public ResponseEntity<Integer> getScore(List<UserResponse> responses)
    {
        int right = 0;
        for(UserResponse res : responses)
        {
            QuestionTable qs = questionDao.findById(res.getId()).get();
            if(res.getResponse().equals(qs.getRightanswer())) {
                right++;
            }
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
