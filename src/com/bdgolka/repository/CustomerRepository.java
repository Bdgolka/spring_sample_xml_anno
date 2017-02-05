package com.bdgolka.repository;

import java.util.List;

import com.bdgolka.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}