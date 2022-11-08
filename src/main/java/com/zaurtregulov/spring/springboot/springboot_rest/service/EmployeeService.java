package com.zaurtregulov.spring.springboot.springboot_rest.service;



import com.zaurtregulov.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void SaveEmployee(Employee employee);
    public Employee getEmployee(int id);

//    public void DeleteEmployee(Employee employee);
    public void DeleteEmployee(int id);

}
