package com.learnmapping.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnmapping.model.Address_OTM;
import com.learnmapping.model.Student_OTM;
import com.learnmapping.repository.MappingRepo_OTM;
@Service
public class MappingServiceImpl_OTM implements MappingService_OTM {
	@Autowired
	private MappingRepo_OTM repo;

	public Student_OTM saveStudent() {
		Address_OTM addr1 = new Address_OTM("Sukhliya, Electronic Complex, 452010");
		Address_OTM addr2 = new Address_OTM("dewas, Electronic Complex, 452010");
		Address_OTM addr3 = new Address_OTM("indore, Electronic Complex, 452010");

		List<Address_OTM> l = new ArrayList<>();
		l = Arrays.asList(addr1, addr2, addr3);
		Student_OTM s = new Student_OTM("Jyoti", l);
		Student_OTM student = repo.save(s);
		return student;

	}
}
