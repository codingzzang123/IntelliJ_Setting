package com.ho.test.controller.main;

import com.ho.test.entity.main.Board;
import com.ho.test.repository.main.BoardRepository;
import com.ho.test.service.main.BoardService;
import com.ho.test.service.main.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    BoardService boardService;


    @GetMapping("/board")
    public String boardForm(Model model){
        List<Board> ls = boardRepository.findAll();

        Integer a = 6;
        Board ps = boardRepository.findByNo(a);

        String name ="admin";
        List<Board> nameList = boardRepository.findByName(name);

        model.addAttribute("content", ls);
        model.addAttribute("a", ps);
        model.addAttribute("nameList", nameList);

        return "index";
    }

    @GetMapping("/test")
    public String testForm(Integer integer){
        integer = 4;
        boardService.plusClick(integer);

        Integer deleteNum = 7;

        boardService.deleteBoard(deleteNum);

        return "test";

    }
}
