package co.edu.cue.Practica_spring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/cucarron")
    public String test(Model model) {
        model.addAttribute("message", "e e e e e e ");
        return "cucarron";
    }
}
