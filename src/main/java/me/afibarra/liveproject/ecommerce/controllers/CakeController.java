package me.afibarra.liveproject.ecommerce.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class CakeController {

    @GetMapping
    public String getWelcome(Model model) {
        return "welcome";
    }
}
