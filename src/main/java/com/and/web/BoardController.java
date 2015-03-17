package com.and.web;

import com.and.domain.Board;
import com.and.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015-03-16.
 */
@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/register")
    public String register(){
        System.out.println("register");
        return "register";
    }

    @RequestMapping("/add")
    public String add(Board board){
        boardService.add(board);
        return "redirect:list";
    }

    @RequestMapping("/list")
    public String boardList(Model model){
        model.addAttribute("list", "boardService.findAll()");
        return "/list";
    }

}
