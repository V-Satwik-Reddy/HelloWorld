package org.learning.first.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Inventory extends MongoRepository<Inventory, String> {

}

