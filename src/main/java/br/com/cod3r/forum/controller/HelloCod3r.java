package br.com.cod3r.forum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCod3r {

    @GetMapping
    public String hello() {
        return "Hello";
    }
}
