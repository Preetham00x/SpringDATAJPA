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

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.telidu.model.Vaccine;
@Repository
public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

}
