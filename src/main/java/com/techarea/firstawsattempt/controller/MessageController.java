package com.techarea.firstawsattempt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {
    @GetMapping
    public String getAString(){
        return "Salut, tocmai ai deploiat prima ta aplicatie pe AWS";
    }
}
