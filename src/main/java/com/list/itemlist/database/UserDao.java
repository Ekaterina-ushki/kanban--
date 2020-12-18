package com.list.itemlist.database;

import com.list.itemlist.model.User;

public interface UserDao {
    User getUser(String login);
    void insertUser(String login, String password, String email);
}
