package com.abc.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.abc.mongodb.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
