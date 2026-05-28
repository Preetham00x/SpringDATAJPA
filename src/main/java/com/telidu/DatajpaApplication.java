package com.telidu;

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
	String status=service.registerVaccineDetailes(new Vaccine("COVSHIELD","APOLLO",23));
	System.out.println(status);
	long count =service.getCount();
	System.out.println("the vaacine count is" +count);

	}

}
