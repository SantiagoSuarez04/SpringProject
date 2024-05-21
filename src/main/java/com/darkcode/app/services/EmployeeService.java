package com.darkcode.app.services;

import java.util.List;

import com.darkcode.app.domain.Employee;

public interface EmployeeService {
    List<Employee> listaEmpleados();
    void GuardarEmpleado(Employee employee);
    void EliminarEmpleado(Employee employee);
    Employee mostrarEmpleado(Long id);
}