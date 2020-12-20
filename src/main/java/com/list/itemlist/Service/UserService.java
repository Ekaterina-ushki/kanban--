package com.list.itemlist.Service;

import com.list.itemlist.database.DBService;
import com.list.itemlist.database.UserDao;
import com.list.itemlist.model.MyUser;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static UserDao dataBase = new DBService();

    public MyUser getUser(String login) {
        return dataBase.getUser(login);
    }

    public void insertUser(String login, String password, String email) {
        //MyUser user = new MyUser(login, password, email);
        dataBase.insertUser(login,password,email);
    }
}
