package com.phataphat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phataphat.model.Address;

public interface AddressRepository extends JpaRepository<Address, String>{

}
