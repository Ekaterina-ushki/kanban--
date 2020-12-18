package com.list.itemlist.database;

import com.list.itemlist.model.Item;

import java.util.List;


public interface ItemDAO {
    void addItem(Item item);
    List<Item> findAllInToDo();
    Item findById(int id);
    void deleteItem(int id);
    int countOfItems();
    List<Item> findAllInProgress();
    void addItemToInProgress(int id);
    List<Item> findAllInDone();
    void addItemToDone(int id);
}
