package com.codegym.service.impl;

import com.codegym.dao.dto.EmployeeDTO;
import com.codegym.dao.entity.Employee;
import com.codegym.dao.repository.EmployeeRepository;
import com.codegym.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public EmployeeDTO findByIdEmployee(Long idEmployee) {
        Employee employee = employeeRepository.findByIdEmployee(idEmployee);
        if (employee != null) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setIdEmployee(employee.getIdEmployee());
            employeeDTO.setAccountEmployee(employee.getAccountEmployee());
            employeeDTO.setPasswordEmployee(employee.getPasswordEmployee());
            employeeDTO.setNameEmployee(employee.getNameEmployee());
            employeeDTO.setBirthDayEmployee(employee.getBirthDayEmployee());
            employeeDTO.setSexEmployee(employee.getSexEmployee());
            employeeDTO.setEmailEmployee(employee.getEmailEmployee());
            employeeDTO.setLicenseEmployee(employee.getLicenseEmployee());
            employeeDTO.setNumberPhoneEmployee(employee.getNumberPhoneEmployee());
            employeeDTO.setAddressEmployee(employee.getAddressEmployee());
            employeeDTO.setImageEmployee(employee.getImageEmployee());
            return employeeDTO;
        }
        return null;
    }

    @Override
    public void updateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeRepository.findByIdEmployee(employeeDTO.getIdEmployee());
            employee.setImageEmployee(employeeDTO.getImageEmployee());
            employee.setPasswordEmployee(employeeDTO.getPasswordEmployee());
            employee.setNameEmployee(employeeDTO.getNameEmployee());
            employee.setBirthDayEmployee(employeeDTO.getBirthDayEmployee());
            employee.setSexEmployee(employeeDTO.getSexEmployee());
            employee.setEmailEmployee(employeeDTO.getEmailEmployee());
            employee.setLicenseEmployee(employeeDTO.getLicenseEmployee());
            employee.setNumberPhoneEmployee(employeeDTO.getNumberPhoneEmployee());
            employee.setAddressEmployee(employeeDTO.getAddressEmployee());
            employeeRepository.save(employee);
    }

    @Override
    public void save(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setAccountEmployee(employeeDTO.getAccountEmployee());
        employee.setPasswordEmployee(employeeDTO.getPasswordEmployee());
        employee.setNameEmployee(employeeDTO.getNameEmployee());
        employee.setBirthDayEmployee(employeeDTO.getBirthDayEmployee());
        employee.setSexEmployee(employeeDTO.getSexEmployee());
        employee.setEmailEmployee(employeeDTO.getEmailEmployee());
        employee.setLicenseEmployee(employeeDTO.getLicenseEmployee());
        employee.setNumberPhoneEmployee(employeeDTO.getNumberPhoneEmployee());
        employee.setAddressEmployee(employeeDTO.getAddressEmployee());
        employee.setImageEmployee(employeeDTO.getImageEmployee());
        employeeRepository.save(employee);
    }

    @Override
    public void removeEmployee(Long idEmployee) {
        employeeRepository.deleteById(idEmployee);
    }
}
