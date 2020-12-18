package com.list.itemlist.controller;

import com.list.itemlist.Service.BoardService;
import com.list.itemlist.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/board")
    public ModelAndView board(Model model) {
        List<Board> boards = boardService.findAllBoard();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("board");
        modelAndView.addObject("boards", boards);
        return modelAndView;
    }

    @PostMapping("/board/add/confirm")
    public ModelAndView add_board(@RequestParam("name") String name){
        boardService.addBoard(0, name);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("confirm_board");
        return modelAndView;
    }
}
