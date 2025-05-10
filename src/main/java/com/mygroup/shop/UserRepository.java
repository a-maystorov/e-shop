package com.mygroup.shop;

public interface UserRepository {
    void save(User user);

    User findByEmail(String email);
}
