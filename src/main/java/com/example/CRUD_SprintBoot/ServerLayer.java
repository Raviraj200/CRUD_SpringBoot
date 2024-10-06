package com.example.CRUD_SprintBoot;
import java.util.List;

public interface ServerLayer {
    String createEmployee(Employee employee);
    List<Employee> readEmploees();
    boolean deleteEmployee(Long id);

}
