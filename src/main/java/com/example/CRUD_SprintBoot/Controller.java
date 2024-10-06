package com.example.CRUD_SprintBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
      ServerLayer serverLayer = new ServerLayerImpl() ;
    @Autowired
    // ServerLayer serverLayer;

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return serverLayer.readEmploees();
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        // employees.add(employee);
        return serverLayer.createEmployee(employee);

    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (serverLayer.deleteEmployee(id)) {
            return "Delete Succesfully";
        }else{
            return "Not Found";
        }
    }

}
