package com.telidu.repo;

import org.springframework.data.repository.CrudRepository;

import com.telidu.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
