package hello.module.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hello.module.mapper.PeopleMapper;
import hello.module.repository.Person;
import hello.module.service.PeopleService;

@Service
public class PeopleServiceImpl implements PeopleService {
	@Autowired
	private PeopleMapper mapper;
	
	@Override
	@Transactional
	public void insert(Person person) {
		mapper.insert(person);
	}
}
