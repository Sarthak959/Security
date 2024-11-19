package com.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/get")
    public String getString(){
        return "Success!!!";
    }

    @GetMapping("/books")
    public String getAllBooks(){
        return "got all books!!!!!!!!!!!!";
    }
}
