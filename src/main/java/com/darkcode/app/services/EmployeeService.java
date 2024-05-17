package com.darkcode.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.darkcode.app.domain.Employee;

public interface EmployeeService {
    public List<Employee> employee_list();
    public void GuardarEmpleado(Employee employee);
    public void EliminarEmpleado(Employee employee);
    public Employee mostrarEmpleado(Employee employee);
}