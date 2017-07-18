package com.allenfancy.service;

import java.util.List;

import com.allenfancy.model.Person;

public interface PersonService {

	public int save(Person person);

	public Person findById(int id);

	public List<Person> findAll();
}
