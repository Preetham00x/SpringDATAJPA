package com.telidu.service;

import java.util.List;

import com.telidu.model.Vaccine;

public interface IVaccineService {
	String registerVaccineDetailes(Vaccine vaccine);
	Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
	Long getCount();
	Boolean checkAvailability(Integer id);
	Iterable<Vaccine> fetchAllVaccines();
	Iterable<Vaccine> fetchAllVAccinesById(Iterable<Integer> ids);
	String registerVaccineDetailes(List<Vaccine> vax);
	Iterable<Vaccine> registerMultipleVaccines(List<Vaccine> vax);

}
