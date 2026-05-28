package com.telidu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telidu.model.Vaccine;
import com.telidu.repo.IVaccineRepo;
@Service
public class VaccineService implements IVaccineService {
@Autowired
private IVaccineRepo repo;
@Override
	public String registerVaccineDetailes(Vaccine vaccine) {
		// TODO Auto-generated method stub
	Vaccine v=repo.save(vaccine);
		return "vaccine info store with id"+v.getId();
		}

}
