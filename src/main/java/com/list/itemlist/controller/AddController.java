package com.list.itemlist.controller;

import com.list.itemlist.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AddController {

    @Autowired
    ItemService itemService;

    @PostMapping("/add/confirm")
    public ModelAndView add(@RequestParam("name") String name,
                            @RequestParam("description") String description,
                            @RequestParam("type") String type,
                            @RequestParam("responsible") String responsible){

        itemService.addItem(0, name, description, type, responsible, "To Do");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("confirm");
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addItem");
        return modelAndView;
    }


    @RequestMapping(path = "/add/{id}/inProgress", method = RequestMethod.POST)
    public void addInProgress(@PathVariable("id") int id) {
        itemService.addItemToInProgress(id);
    }

    @RequestMapping(path = "/add/{id}/done", method = RequestMethod.POST)
    public void addInDone(@PathVariable("id") int id) {
        itemService.addItemToDone(id);
    }
}
