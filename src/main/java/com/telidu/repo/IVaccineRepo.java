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

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.telidu.model.Vaccine;
@Repository
public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	public List<Vaccine> findByCost(Integer cost);
	public  List<Vaccine> findByCostIs(Integer cost);
	public List<Vaccine> findByCostEquals(Integer cost);
	public List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> names,Integer minCost,Integer maxCost);

}
