package com.aws.spring.awstraining.controllers;

import com.aws.spring.awstraining.entity.Employee;
import com.aws.spring.awstraining.entity.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeImpl empRepository;

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestParam String empName) {
        Employee employee = new Employee();
        employee.setName(empName);
        return empRepository.save(employee);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam String newName,Integer empId) {
        Employee employee = empRepository.findById(empId).get();
        employee.setName(newName);
        return empRepository.save(employee);
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployee(@PathVariable("empId") Integer empId) {
        empRepository.deleteById(empId);
        return String.format("User with id %d deleted successfully ",empId);
    }
}
