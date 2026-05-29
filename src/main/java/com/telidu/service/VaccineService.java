package com.telidu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telidu.model.Vaccine;
import com.telidu.repo.IVaccineRepo;
@Service
public class VaccineService implements IVaccineService {
private IVaccineRepo repo;
//@Override
//	public String registerVaccineDetailes(Vaccine vaccine) {
//		// TODO Auto-generated method stub
//	Vaccine v=repo.save(vaccine);
//		return "vaccine info store with id"+ v.getId();
//		}
//
//public Long getCount() {
//	// TODO Auto-generated method stub
//	return repo.count();
//}
//@Override
//public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
//	// TODO Auto-generated method stub
//	return repo.saveAll(vaccines);
//}
//@Override
//public Boolean checkAvailability(Integer id) {
//	// TODO Auto-generated method stub
//	return repo.existsById(id);
//}
//@Override
//public Iterable<Vaccine> fetchAllVaccines() {
//	// TODO Auto-generated method stub
//	return repo.findAll();
//}
//@Override
//public Iterable<Vaccine> fetchAllVAccinesById(Iterable<Integer> ids) {
//	// TODO Auto-generated method stub
//	return repo.findAllById(ids);
//}
//
//@Override
//public Iterable<Vaccine> registerMultipleVaccines(List<Vaccine> vax) {
//	return repo.saveAll(vax);
//}
//
//@Override
//public String registerVaccineDetailes(List<Vaccine> vax) {
//	// TODO Auto-generated method stub
//	return null;
//}

@Autowired
public void setRepo(IVaccineRepo repo) {
	this.repo = repo;
}

@Override
public Iterable<Vaccine> fetchVaccineInfoSorting(Boolean status, String...properties) {
	Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, properties);
	// TODO Auto-generated method stub
	return repo.findAll(sort);
}

@Override
public Iterable<Vaccine> fetchVaccineInfoPagination(int PgNo, int PgSize, boolean status, String... properties) {
	
	PageRequest pageable=PageRequest.of( PgNo, PgSize,status?Direction.ASC:Direction.DESC, properties);
	Page<Vaccine> page= repo.findAll(pageable);
	return page.getContent();
}




}
