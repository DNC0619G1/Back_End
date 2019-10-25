package com.codegym.web_service.controller;


import com.codegym.dao.dto.EmployeeDTO;
import com.codegym.dao.entity.Employee;
import com.codegym.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        List<Employee> employees;
        employees = employeeService.findAll();
        return employees;
    }

    @PostMapping("/employees")
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.save(employeeDTO);
        return ResponseEntity.ok(employeeDTO);
    }

    //    @PostMapping("/employees")
//    public ResponseEntity<Employee> createEmployee( @RequestBody Employee employee){
//        employeeService.save(employee);
//        return ResponseEntity.ok(employee);
//    }
    @GetMapping("/employees/details/{idEmployee}")
    public ResponseEntity<EmployeeDTO> getEmployeeByIdEmployee(@PathVariable(value = "idEmployee") Long idEmployee) {
        EmployeeDTO employeeDTO = employeeService.findByIdEmployee(idEmployee);
        return ResponseEntity.ok().body(employeeDTO);
    }

    @PutMapping("/employees/update/{idEmployee}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable(value = "idEmployee") Long idEmployee
            , @RequestBody EmployeeDTO employeeDTO) {
        employeeDTO.setIdEmployee(idEmployee);
        employeeService.updateEmployee(employeeDTO);
        return ResponseEntity.ok(employeeDTO);
    }

    @DeleteMapping(value = {"/employees/delete/{idEmployee}"})
    public ResponseEntity<?> deleteEmployee(@PathVariable("idEmployee") Long idEmployee) {
        employeeService.removeEmployee(idEmployee);
        return ResponseEntity.ok("Delete");
    }
//    @DeleteMapping(value = {"/employees/delete/{idEmployee}"})
//    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "idEmployee") Long idEmployee) {
//        EmployeeDTO employeeDTO = employeeService.findByIdEmployee(idEmployee);
//        employeeService.removeEmployee(employeeDTO.getIdEmployee());
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }
}
