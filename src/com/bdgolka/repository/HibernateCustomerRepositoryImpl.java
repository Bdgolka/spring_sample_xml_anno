package com.bdgolka.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bdgolka.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Julia");
		customer.setLastname("Pulova");
		
		customers.add(customer);
		
		return customers;		
	}
}
