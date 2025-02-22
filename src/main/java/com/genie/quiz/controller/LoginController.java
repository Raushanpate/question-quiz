package com.genie.quiz.controller;

import com.genie.quiz.dto.LoginRequest;
import com.genie.quiz.entity.History;
import com.genie.quiz.entity.QuizQuestion;
import com.genie.quiz.entity.javascript_question;
import com.genie.quiz.service.HistoryService;
import com.genie.quiz.service.QuestionService;
import com.genie.quiz.service.jsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:3002")
@RestController
@RequestMapping("/api")
public class LoginController {


    @Autowired
    QuestionService questionService;
    @Autowired
    jsService jsService;
    @Autowired
    HistoryService historyService;


    // Hardcoded credentials for now
    private final String USERNAME = "user";
    private final String PASSWORD = "password";


    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        if (USERNAME.equals(loginRequest.getUsername()) && PASSWORD.equals(loginRequest.getPassword())) {
            return "Login Successful!";
        } else {
            return "Invalid username or password";
        }
    }
    @GetMapping("/java_question")
    public List<QuizQuestion> getQuestions() {
            return questionService.getAllQuestions();
    }

    @PostMapping(value = "/java_save", consumes = "application/json", produces = "application/json")
    public QuizQuestion saveQuestion(@RequestBody QuizQuestion question) {
        return questionService.saveQuestion(question);
    }
    //javascript
    @GetMapping("/javascript_question")
    public List<javascript_question> getJsQuestion(){
        return jsService.getjsQuestion();
    }
    @PostMapping(value = "/javascript_save", consumes = "application/json", produces = "application/json")
    public javascript_question saveQuestion(@RequestBody javascript_question question) {
        return jsService.saveQuestion(question);
    }
    //History
    @GetMapping("/history_question")
    public List<History> getHistoryQuestion(){
        return historyService.getjsQuestion();
    }
    @PostMapping(value = "/history_save", consumes = "application/json", produces = "application/json")
    public History saveQuestion(@RequestBody History question) {
        return historyService.saveQuestion(question);
    }

}
