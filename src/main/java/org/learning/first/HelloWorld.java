package org.learning.first;

import org.learning.first.Repository.InventoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.learning.first.Model.*;

import java.util.List;

@RestController
public class HelloWorld {

    InventoryRepository iR;
    @GetMapping("/")
    public Message helloWorld() {
        Message m = new Message();
        m.setMessage("HelloWorld!");
        return m;
    }
    @PostMapping("/addItem")
    public Message addItem(@RequestBody Inventory inventory ) {
        Message m = new Message();
        iR.save(inventory);
        m.setMessage("Item added successfully!");
        return m;
    }
}
