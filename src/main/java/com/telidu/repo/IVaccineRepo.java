//package com.telidu.repo;
//
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import com.telidu.model.Customer;
//@Repository
//public interface ICustomerRepo extends CrudRepository<Customer, Integer> {
//
//}

package com.telidu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telidu.model.Vaccine;
@Repository
public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {

}
