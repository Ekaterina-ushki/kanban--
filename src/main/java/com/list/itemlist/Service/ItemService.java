package com.list.itemlist.Service;

import com.list.itemlist.database.DBService;
import com.list.itemlist.database.ItemDAO;
import com.list.itemlist.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private static ItemDAO dataBase = new DBService();

    public void addItem(int id, String name, String description, String type, String responsible, String status) {
        Item item = new Item(id, name, description, type, responsible, status);
        dataBase.addItem(item);
    }

    public void addItemToInProgress(int id) {
        dataBase.addItemToInProgress(id);
    }

    public List<Item> findAllInToDo() {
        return dataBase.findAllInToDo();
    }


    public Item findById(int id) {
        return dataBase.findById(id);
    }

    public int countOfItems(){
        return dataBase.countOfItems();
    }


    public void deleteItem(int id) {
        dataBase.deleteItem(id);
    }

    public List<Item> findAllInProgress(){
        return dataBase.findAllInProgress();
    }

    public List<Item> findAllInDone(){
        return dataBase.findAllInDone();
    }

    public void addItemToDone(int id) {
        dataBase.addItemToDone(id);
    }

}
