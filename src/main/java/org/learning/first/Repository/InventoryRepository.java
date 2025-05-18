package org.learning.first.Repository;

import org.learning.first.Model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InventoryRepository extends MongoRepository<Inventory, String> {

    List<Inventory> findByTagsContaining(String tag);
}

