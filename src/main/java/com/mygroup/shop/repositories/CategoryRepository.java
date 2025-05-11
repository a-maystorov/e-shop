package com.mygroup.shop.repositories;

import com.mygroup.shop.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}