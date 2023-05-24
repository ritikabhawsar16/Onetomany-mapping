package com.learnmapping.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
public class Student_OTM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int sId;

	@Column(name = "student_name")
	private String sName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "addr_id")
	private List<Address_OTM> l = new ArrayList<>();

	public Student_OTM(String sName, List<Address_OTM> l) {
		super();
		this.sName = sName;
		this.l = l;
	}

}
