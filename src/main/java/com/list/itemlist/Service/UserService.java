package com.list.itemlist.Service;

import com.list.itemlist.database.DBService;
import com.list.itemlist.database.UserDao;
import com.list.itemlist.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static UserDao dataBase = new DBService();

    public User getUser(String login) {
        return dataBase.getUser(login);
    }

    public void insertUser(String login, String password, String email) {
        //User user = new User(login, password, email);
        dataBase.insertUser(login,password,email);
    }
}
