package com.xpanxion.service;
import java.util.List;

import com.xpanxion.model.Employee;

public interface EmployeeService {
public void addEmployee(Employee e);
public List<Employee> listActiveEmployee();
public List<Employee> listInActiveEmployee();
public List<Employee> listEmployee();
public List<Employee> listEmployeeTrainer();
public Employee getEmployeeById(int empId);
}

