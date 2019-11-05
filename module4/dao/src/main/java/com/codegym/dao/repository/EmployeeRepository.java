package com.codegym.dao.repository;

import com.codegym.dao.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    Employee findByIdEmployee(Long idEmployee);


    List<Employee> findAllByNameEmployeeContaining(String nameEmployee);

}
