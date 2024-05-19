package org.example.controller;

import org.example.model.Item;
import org.example.service.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemServices itemServices;
    private final String ENDPOINT = "api/v1/items";
    @CrossOrigin
    @PostMapping(ENDPOINT)
    public ResponseEntity<Item> insert(@RequestBody Item item){
        itemServices.add(item);
        return ResponseEntity.status(201).body(item);
    }
    @CrossOrigin
    @PutMapping(ENDPOINT)
    public ResponseEntity<Item>  update(@RequestBody Item item){
        itemServices.update(item);
        return ResponseEntity.status(204).body(item);
    }
    @CrossOrigin
    @GetMapping(ENDPOINT)
    public List<Item> findAll(){
        return itemServices.getAll();
    }

    @CrossOrigin
    @DeleteMapping(ENDPOINT + "/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
        itemServices.delete(id);
        return ResponseEntity.status(204).build();
    }

}
