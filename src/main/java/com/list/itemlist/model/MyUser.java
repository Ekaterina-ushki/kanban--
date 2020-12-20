package com.list.itemlist.model;

import javax.persistence.*;

@Entity
@Table(name="usr")
public class MyUser {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="login", unique = true)
    private String login;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    public MyUser(){}

    public MyUser(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
