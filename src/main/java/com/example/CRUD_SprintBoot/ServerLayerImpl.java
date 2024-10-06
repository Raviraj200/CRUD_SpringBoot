package com.example.CRUD_SprintBoot;

import java.util.List;
import java.util.ArrayList;


public class ServerLayerImpl implements ServerLayer {

    List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee employee) {
        employees.add(employee);
        return "Saved Successfully";
    }

    @Override
    public List<Employee> readEmploees() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
            employees.remove(id);
            return true;
    }
}
