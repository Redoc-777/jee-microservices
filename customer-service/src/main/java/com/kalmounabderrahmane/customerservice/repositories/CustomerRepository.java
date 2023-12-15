package com.kalmounabderrahmane.customerservice.repositories;

import com.kalmounabderrahmane.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findByFirstNameContains(String fn);
    List<Customer> findByFirstNameContainsOrLastNameContains(String fn, String ln);

}
