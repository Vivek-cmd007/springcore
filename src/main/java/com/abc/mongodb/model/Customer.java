package com.abc.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Document (collection="customer")
public class Customer {

	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String mobile;
	
	
}
