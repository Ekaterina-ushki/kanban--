package com.list.itemlist.controller;

import com.list.itemlist.Service.ItemService;
import com.list.itemlist.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class MainController {

    @Autowired
    ItemService itemService;

    @GetMapping("/main")
    public ModelAndView main(Model model) {
        List<Item> items = itemService.findAllInToDo();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        modelAndView.addObject("items", items);
        return modelAndView;
    }

    @GetMapping("/inProgress")
    public ModelAndView inProgress(Model model) {
        List<Item> items = itemService.findAllInProgress();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("inProgress");
        modelAndView.addObject("items", items);
        return modelAndView;
    }

    @GetMapping("/done")
    public ModelAndView done(Model model) {
        List<Item> items = itemService.findAllInDone();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("done");
        modelAndView.addObject("items", items);
        return modelAndView;
    }
}
