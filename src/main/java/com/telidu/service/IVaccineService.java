package com.telidu.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.telidu.model.Vaccine;
import com.telidu.view.ResultView;

public interface IVaccineService {
	List<ResultView> searchByCostLessThan(Integer cost);
//	public List<Vaccine> searchByCost(Integer cost);
//	public List<Vaccine> searchByCostIs(Integer cost);
//	public List<Vaccine> searchByCostEquals(Integer cost);
//	public List<Vaccine> searchByVaccineNameInAndCostBetween(Collection<String> names,Integer minCost,Integer maxCost);
//	Vaccine fetchById(Integer id);
//	List<Vaccine> fetchByVaccineInfo(Vaccine vac);
	
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
