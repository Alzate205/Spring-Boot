package co.edu.cue.Practica_spring.demo.controllers;

import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Usuarios")
public class UserController {

    @RequestMapping(value = "/test")
    public String test() {
        return "Hola desde Orslok";
    }

    @RequestMapping(value = "/test2")
    public List<String> test2() {
        return List.of("get", "over", "here", "lets", "dance");
    }

    @GetMapping(value = "/Obtener-Usuarios")
    public User getUser() {
        return User.builder()
                .id("1")
                .name("Samu")
                .age(18)
                .cellphone("3157048254")
                .email("salzate2221@cue.edu.co")
                .build();
    }

    @GetMapping(value = "/Obtener-Usuarios-id/{id}")
    public User getUserById(@PathVariable String id) throws BadRequestException {
        if (id.equalsIgnoreCase("1")) {
            return User.builder()
                    .id("1")
                    .name("Samu")
                    .age(18)
                    .cellphone("3157048254")
                    .email("salzate2221@cue.edu.co")
                    .build();
        } else {
            throw new BadRequestException("No estas pai");
        }
    }
}