package org.learning.first;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.learning.first.Model.*;

import java.util.List;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public Message helloWorld() {
        Message m = new Message();
        m.setMessage("HelloWorld!");
        return m;
    }
    @PostMapping("/helloyouname")
    public Message welcomeMessage() {
        Message m = new Message();
        m.setMessage("Welcome to HelloWorld!");
        return m;
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Message> deleteMessage() {
        Message m = new Message();
        m.setMessage("Can delete shit!");
        return ResponseEntity.ok(m);
    }
}
