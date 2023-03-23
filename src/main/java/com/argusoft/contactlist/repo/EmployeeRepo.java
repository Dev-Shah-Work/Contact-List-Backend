package com.argusoft.contactlist.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argusoft.contactlist.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    /*Jpa repository is inbuilt repository having so many ready to use functions it takes your model(Table schema) and your primary keys as input */
   

    Optional<Employee> findEmployeeById(Long id);
}
