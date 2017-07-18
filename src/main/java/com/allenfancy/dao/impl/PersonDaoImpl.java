package com.allenfancy.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.allenfancy.dao.PersonDao;
import com.allenfancy.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao{

	@Override
	public int save(Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Person findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
