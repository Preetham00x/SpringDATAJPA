package com.telidu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telidu.model.Vaccine;
import com.telidu.service.VaccineService;
import com.telidu.view.ResultView1;

@SpringBootApplication
public class DatajpaApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=SpringApplication.run(DatajpaApplication.class, args);
	VaccineService service=container.getBean(VaccineService.class);
	service.searchByCostLessThan(1000,ResultView1.class).forEach(v->System.out.println(v.getVaccineCompany()+" "+ v.getVaccineName()));
//	service.searchByCostLessThan(1000).forEach(v->System.out.println(v.getVaccineName() +" "+ v.getVaccineCompany()));
////	Collection<String> names =new HashSet<>();
//	names.add("COVSHIELD");
//	names.add("NEGRO");
//	names.add("ALI");
//	service.searchByVaccineNameInAndCostBetween(names, 1, 2000).forEach(v->System.out.println(v));
//	service.searchByCostEquals(222).forEach(v->System.out.println(v));
//	service.searchByCost(1).forEach(v->System.out.println(v));
//	service.searchByCostIs(23).forEach(v->System.out.println(v));
//	service.fetchVaccineInfoPagination(1, 3, true, "vaccineName").forEach(v->System.out.println(v));
//	service.fetchVaccineInfoSorting(true,"vaccineName").forEach(v->System.out.println(v));;
//	String status=service.registerVaccineDetailes(new Vaccine("COVSHIELD","APOLLO",23.0));
//	System.out.println(status);
//	String status1=service.registerVaccineDetailes(new Vaccine("NEGRO","CIPLA",1.0));
//	System.out.println(status1);
//	long count =service.getCount();
//	System.out.println("the vaacine count is" +count);
//	List<Vaccine> vax=new ArrayList<>();
//	vax.add(new Vaccine("COVSHIELD","APOLLO",23.0));
//	vax.add(new Vaccine("NEGRO","CIPLA",1.0));
//	vax.add(new Vaccine("ALI","KUNDA",222.0));
//	service.registerMultipleVaccines(vax);
//	List<Integer> ids=new ArrayList<>(); 
//	ids.add(552);
//	ids.add(553);
//	ids.add(69);
//	service.fetchAllVAccinesById(ids).forEach(v->System.out.println(v));
//	Iterable<Vaccine> savedVaccines = service.registerMultipleVaccines(vax);
//
//	savedVaccines.forEach(v -> System.out.println(v));

	}

}
