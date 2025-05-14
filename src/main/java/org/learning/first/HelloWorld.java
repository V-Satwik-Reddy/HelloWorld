package org.learning.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.learning.first.Model.*;

import java.util.List;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public static String helloWorld(){
        return "Hello World";
    }
    @PostMapping("/helloyouname")
    public Message welcomeMessage() {
        Message m = new Message();
        m.setMessage("Welcome to HelloWorld!");
        return m;
    }
}
