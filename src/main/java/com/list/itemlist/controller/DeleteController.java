package com.list.itemlist.controller;

import com.list.itemlist.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DeleteController {

    @Autowired
    ItemService service;

    @RequestMapping(path = "/item/{id}/delete", method = RequestMethod.POST)
    public ModelAndView delete(@PathVariable("id") int id) {
        service.deleteItem(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

}
