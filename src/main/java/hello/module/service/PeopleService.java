package hello.module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hello.module.mapper.PeopleMapper;
import hello.module.repository.Person;

@Service
public class PeopleService {
	@Autowired
	private PeopleMapper mapper;
	
	@Transactional
	public void insert(Person person) {
		mapper.insert(person);
	}
}
