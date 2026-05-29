package com.telidu.service;

import java.util.List;
import java.util.Optional;

import com.telidu.model.Vaccine;

public interface IVaccineService {
	Vaccine fetchById(Integer id);
	List<Vaccine> fetchByVaccineInfo(Vaccine vac);
//	String registerVaccineDetailes(Vaccine vaccine);
//	Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
//	Long getCount();
//	Boolean checkAvailability(Integer id);
//	Iterable<Vaccine> fetchAllVaccines();
//	Iterable<Vaccine> fetchAllVAccinesById(Iterable<Integer> ids);
//	String registerVaccineDetailes(List<Vaccine> vax);
//	Iterable<Vaccine> registerMultipleVaccines(List<Vaccine> vax);
//	Optional<Vaccine> fetchVaccineById();
//	Iterable<Vaccine> fetchVaccineInfoSorting(Boolean status,String... properties);
//	Iterable<Vaccine> fetchVaccineInfoPagination(int PgNo,int PgSize,boolean status,String... properties);

}
