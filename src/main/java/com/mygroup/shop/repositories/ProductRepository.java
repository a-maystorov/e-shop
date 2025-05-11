package com.mygroup.shop.repositories;

import com.mygroup.shop.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}