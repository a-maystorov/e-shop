package com.mygroup.shop.repositories;

import com.mygroup.shop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
