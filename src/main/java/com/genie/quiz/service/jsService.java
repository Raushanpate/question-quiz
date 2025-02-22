package com.genie.quiz.service;

import com.genie.quiz.entity.History;
import com.genie.quiz.entity.QuizQuestion;
import com.genie.quiz.entity.javascript_question;
import com.genie.quiz.repo.HistoryRepo;
import com.genie.quiz.repo.jsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class jsService {
    @Autowired
    jsRepo jsRepo;
    public List<javascript_question> getjsQuestion(){

        return jsRepo.findAll();
    }
    public javascript_question saveQuestion(javascript_question question){
        javascript_question save = jsRepo.save(question);
        return save;
    }

}
