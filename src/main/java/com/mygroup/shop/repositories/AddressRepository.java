package com.mygroup.shop.repositories;

import com.mygroup.shop.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}