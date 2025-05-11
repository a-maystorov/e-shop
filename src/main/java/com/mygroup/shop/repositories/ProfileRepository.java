package com.mygroup.shop.repositories;

import com.mygroup.shop.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}