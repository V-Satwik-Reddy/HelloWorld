package org.learning.first.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    private int id;
    private String name;
    private String description;
    private List<String> tags;
    private int price;
    private int quantity;
}
