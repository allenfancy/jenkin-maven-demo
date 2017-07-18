package com.allenfancy.dao;

import java.util.List;

import com.allenfancy.model.Person;

public interface PersonDao {

	public int save(Person person);

	public Person findById(int id);

	public List<Person> findAll();
}
