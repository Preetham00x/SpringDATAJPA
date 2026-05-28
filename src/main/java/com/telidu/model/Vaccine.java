//package com.telidu.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//@Entity
//public class Customer {
//	@Id
//	private Integer id;
//	private String name;
//	private String city;
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	@Override
//	public String toString() {
//		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
//	}
//	public Customer(Integer id, String name, String city) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.city = city;
//	}
//	public Customer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//}

package com.telidu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Vaccine {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer id;
	
	private String vaccineName;
	
	private String vaccineCompany;
	
	private Double cost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vaccine [vaccineName=" + vaccineName + ", vaccineCompany=" + vaccineCompany + ", cost=" + cost + "]";
	}

	

	public Vaccine(String vaccineName, String vaccineCompany, int i) {
		super();
		this.vaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
		this.cost = cost;
	}

	
	

	

}
