package org.example.controller;

import org.example.model.Questions;
import org.example.service.QuestionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionsController {

    @Autowired
    private QuestionsServices questionsServices;

    @GetMapping("/questions")
    public List<Questions> getQuestions(){
        return questionsServices.getQuestions();
    }

    @GetMapping("/question")
    public Questions getQuestion(){
        return questionsServices.getQuestion();
    }
}
