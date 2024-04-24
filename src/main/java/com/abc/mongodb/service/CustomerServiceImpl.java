package com.abc.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.mongodb.exception.ResourceNotFoundException;
import com.abc.mongodb.model.Customer;
import com.abc.mongodb.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
	 customerRepository.save(customer);
		return customer;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Optional<Customer> optionalcustomer = customerRepository.findById(customerId);
		if(optionalcustomer.isEmpty()) {
			throw new ResourceNotFoundException("Customer not found with customer id "+customerId);
			
		}
		return optionalcustomer.get();
	}

	@Override
	public List<Customer> getAllcustomer() {
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
       Optional<Customer> optionalcustomer = customerRepository.findById(customer.getId());
       if(optionalcustomer.isEmpty()) {
    	   throw new ResourceNotFoundException("Customer not found with id "+customer.getId());
       }
       customerRepository.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		Optional<Customer> optionalcustomer = customerRepository.findById(customerId);
		if(optionalcustomer.isEmpty()) {
			throw new ResourceNotFoundException("Customer not found with customer id "+customerId);
			
		}
		Customer customer =optionalcustomer.get();
		customerRepository.delete(customer);
		
	}

}

