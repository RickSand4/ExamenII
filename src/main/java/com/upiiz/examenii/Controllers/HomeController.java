package com.upiiz.examenii.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
}
