package org.learning.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public static String helloWorld(){
        return "Hello World";
    }
    @PostMapping("/helloyouname")
    public static String helloUser(){
        return "enter you name";
    }
}
