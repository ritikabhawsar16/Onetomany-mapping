package com.learnmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnmapping.model.Student_OTM;

@Repository
public interface MappingRepo_OTM extends JpaRepository<Student_OTM, Integer>{

}
