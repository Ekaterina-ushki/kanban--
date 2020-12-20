package com.list.itemlist.database;

import com.list.itemlist.model.MyUser;

public interface UserDao {
    MyUser getUser(String login);
    void insertUser(String login, String password, String email);
}
