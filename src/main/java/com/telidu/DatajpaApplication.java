package com.telidu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telidu.model.Vaccine;
import com.telidu.service.VaccineService;

@SpringBootApplication
public class DatajpaApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=SpringApplication.run(DatajpaApplication.class, args);
	VaccineService service=container.getBean(VaccineService.class);
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
