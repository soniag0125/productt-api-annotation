package com.wiredbraincoffe.producttapiannotation.repository;

import com.wiredbraincoffe.producttapiannotation.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
