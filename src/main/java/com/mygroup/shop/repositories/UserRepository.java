package com.mygroup.shop.repositories;

import com.mygroup.shop.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
