package com.list.itemlist.controller;

import com.list.itemlist.Service.UserService;
import com.list.itemlist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EntryController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public ModelAndView index(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @PostMapping("/")
    public ModelAndView index(@RequestParam("login") String login,
                              @RequestParam("pass") String password){
        User user = userService.getUser(login);
        ModelAndView modelAndView = new ModelAndView();
        if (user == null || !user.getPassword().equals(password)){
            modelAndView.setViewName("registration");
        } else {
            modelAndView.setViewName("main");
        }
        return modelAndView;
    }
}
