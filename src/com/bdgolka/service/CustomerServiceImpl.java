package com.bdgolka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdgolka.model.Customer;
import com.bdgolka.repository.CustomerRepository;
import com.bdgolka.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl (CustomerRepository customerRepository){
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("We are using setter injection");
	}

	public List<Customer> findAll(){
		
		return customerRepository.findAll();
		
	}
}
