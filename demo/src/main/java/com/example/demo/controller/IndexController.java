package com.example.demo.controller;

import com.example.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("current_date", indexService.getDate());
        return "index";
    }
}
