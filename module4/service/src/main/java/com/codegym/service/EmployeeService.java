package com.codegym.service;

import com.codegym.dao.dto.EmployeeDTO;
import com.codegym.dao.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    EmployeeDTO findByIdEmployee(Long idEmployee);

    void save(EmployeeDTO employeeDTO);
//    void save(Employee employee);

    void updateEmployee(EmployeeDTO employeeDTO);

    void removeEmployee(Long idEmployee);
}
