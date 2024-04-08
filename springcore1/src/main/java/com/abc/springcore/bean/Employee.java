package com.abc.springcore.bean;

import java.util.Map;
import java.util.Set;

public class Employee {

	private int empId;
	private String name;
	private Set<String> skills;
	private Address address;
	private Map<String, Integer> skill, rating;

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public Map<String, Integer> getSkill() {
		return skill;
	}

	public void setSkill(Map<String, Integer> skill) {
		this.skill = skill;
	}

	public Map<String, Integer> getRating() {
		return rating;
	}

	public void setRating(Map<String, Integer> rating) {
		this.rating = rating;
	}

	public Address getAddress()

	{
		return address;
	}

}
