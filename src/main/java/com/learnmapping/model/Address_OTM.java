package com.learnmapping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address_OTM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id")
	private int aID;

	@Column(name = "address_info")
	private String address;

	public Address_OTM(String address) {
		this.address = address;
	}
//    @ManyToOne	//by this extra table is removed//
//    List<Student_OTM> accountList=new ArrayList<Account>() ;

	@ManyToOne
	Student_OTM s;
}
