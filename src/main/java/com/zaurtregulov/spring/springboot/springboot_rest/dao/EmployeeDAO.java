package com.zaurtregulov.spring.springboot.springboot_rest.dao;



import com.zaurtregulov.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

//    void deleteEmployee(Employee employee);
    void deleteEmployee(int id);
}
