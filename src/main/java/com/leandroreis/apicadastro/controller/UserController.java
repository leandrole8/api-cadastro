package com.leandroreis.apicadastro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String message(){
        return "Bom dia pra quem ta com a aplicação ON!";
    }
}
