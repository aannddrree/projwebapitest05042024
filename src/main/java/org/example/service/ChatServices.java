package org.example.service;

import org.example.model.Chat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatServices {

    private static List<Chat> lst = new ArrayList<>();

    public List<Chat> getLst(){
        return lst;
    }

    public void clear(){
        lst.clear();
    }

    public Chat add(Chat chat){
        lst.add(chat);
        return chat;
    }

}
