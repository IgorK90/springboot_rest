package com.zaurtregulov.spring.springboot.springboot_rest.controller;



import com.zaurtregulov.spring.springboot.springboot_rest.entity.Employee;
import com.zaurtregulov.spring.springboot.springboot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);

//        if (employee == null)
//            throw new NoSuchEmployeeException("There is no employee with id="+id+" in database");
        return  employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){
        employeeService.SaveEmployee(employee);
        return employee;

    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.SaveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
//        if (employee==null)
//            throw new NoSuchEmployeeException("there is no employee with id="+id+" in database");
        employeeService.DeleteEmployee(id);
        return("employee with id=" + id + " was deleted");
    }

}
