package com.learnmapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnmapping.model.Student_OTM;
import com.learnmapping.service.MappingService_OTM;

@RestController
public class OTM_Controller {

	@Autowired
	private MappingService_OTM service;

	@PostMapping("/save")
	public ResponseEntity<Student_OTM> saveStudentWithInfo() { // TO GET STATUS CODE ,header & body
		Student_OTM saveStudent = service.saveStudent();
		return new ResponseEntity<Student_OTM>(saveStudent, HttpStatus.CREATED);
	}
}