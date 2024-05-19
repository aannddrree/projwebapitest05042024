package org.example.service;

import org.example.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServices {
    static List<Item> items = new ArrayList<>();
    public ItemServices(){
        for (int i = 1;i<= 10; i++){
            items.add(new Item(i, "teste"+i));
        }
    }
    public List<Item> getAll(){
        return items;
    }
    public void add(Item item){
        Optional<Integer> maxId = items.stream()
                .map(Item::getId) // Mapeia cada item para seu ID
                .max(Integer::compareTo); // Encontra o maior ID

        if (maxId.isPresent()) {
            item.setId(maxId.get() + 1);
        } else {
            item.setId(1);
        }


        items.add(item);
    }
    public void delete(int id){
        items.removeIf(data -> data.getId() == id);
    }
    public void update(Item item){
        items.set(item.getId() - 1, item);
    }
   /* public static void main(String[] args) {
        new ItemServices();
        for (Item item : getAll()){
            System.out.println(item.getName());
        }

        add(new Item(11, "sdfdsfsf"));


        for (Item item : getAll()){
            System.out.println(item.getName());
        }

        update(new Item(11,"teste11"));


        for (Item item : getAll()){
            System.out.println(item.getName());
        }

        delete(new Item(11,"teste11"));

        for (Item item : getAll()){
            System.out.println(item.getName());
        }
    }*/
}
