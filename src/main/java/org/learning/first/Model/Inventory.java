package org.learning.first.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    private int id;
    private String name;
    private String description;
    private int price;
    private int quantity;
}
