package com.abc.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.mongodb.model.Customer;
import com.abc.mongodb.service.CustomerService;

@RestController
public class CustomerController {
	
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/all")
	public List<Customer> fetchAllCustomers() {
		List<Customer> customers =customerService.getAllcustomer();
		return  customers;
	}
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerDetails(@PathVariable("id") int customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		return new ResponseEntity<>(customer, HttpStatus.OK);

	}

	@PostMapping("/save")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer, HttpStatus.CREATED);
		return responseEntity;
	}

	@PutMapping("/update")
	public ResponseEntity<Customer> editCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCustomer(@PathVariable("id") int customerId) {
		customerService.deleteCustomer(customerId);
		ResponseEntity<Void> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		return responseEntity;

	}
	
	
//	@Autowired
//	private CustomerRepository customerRepo;
//	
//	
//	@GetMapping("/all")
//	public ResponseEntity<?> getAllCustomer(){
//		
//		List<Customer> customer = customerRepo.findAll();
//		
//		if(customer.size()>0) {
//			return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
//		}else {
//			return new ResponseEntity<>("No customer found",HttpStatus.NOT_FOUND);
//		}
//	}
//	
//	@PostMapping("/save")
//	public ResponseEntity<?> createCustomer(@RequestBody Customer customer){
//		customerRepo.save(customer);
//	
//		
//		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<?> getCustomerById(@PathVariable("id" int id)){
//		
//	}

}
