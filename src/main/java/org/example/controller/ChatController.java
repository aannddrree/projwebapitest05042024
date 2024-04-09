package org.example.controller;

import org.example.model.Chat;
import org.example.service.ChatServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ChatController {

    @Autowired
    private ChatServices chatServices;

    @CrossOrigin
    @GetMapping("/chat")
    public List<Chat> getLst(){
        return chatServices.getLst();
    }

    @CrossOrigin
    @PostMapping("/chat")
    public Chat add(@RequestBody Chat chat){
        return chatServices.add(chat);
    }

    @CrossOrigin
    @PostMapping("/clear")
    public void clear(){
        chatServices.clear();
    }
}
