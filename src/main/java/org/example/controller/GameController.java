package org.example.controller;

import org.example.model.Game;
import org.example.service.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {
    @Autowired
    private GameServices gameServices;

    @CrossOrigin
    @GetMapping("/game")
    public List<Game> getLst(){
        return gameServices.getGames();
    }

    @CrossOrigin
    @GetMapping("/sortearGame")
    public Game sortearGame(){
        return gameServices.sortearGame();
    }

}
