package com.example.demo.controller;

import com.example.demo.service.IndexService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final IndexService indexService;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("current_date", indexService.getDate());
        return "index";
    }
}
