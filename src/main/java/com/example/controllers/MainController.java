package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(Model model,
                       @RequestParam(name = "color",required = false) String color,
                       @RequestParam(name = "degrees",required = false) String degrees) {
        model.addAttribute("degrees",degrees);
        model.addAttribute("color",color);
        return "home";
    }
}
