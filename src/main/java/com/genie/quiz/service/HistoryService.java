package com.genie.quiz.service;

import com.genie.quiz.entity.History;
import com.genie.quiz.entity.javascript_question;
import com.genie.quiz.repo.HistoryRepo;
import com.genie.quiz.repo.jsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
    @Autowired
    HistoryRepo historyRepo;
    public List<History> getjsQuestion(){

        return historyRepo.findAll();
    }
    public History saveQuestion(History question){
        History save = historyRepo.save(question);
        return save;
    }
}
