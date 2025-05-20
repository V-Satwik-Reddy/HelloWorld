package org.learning.first;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping("/addItem")
    public Message addItem(@RequestBody) {
        Message m = new Message();

    }
}
