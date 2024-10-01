package com.example.employeemanagementdepartmentsv.repository;


import com.example.employeemanagementdepartmentsv.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    List<Employee> findAllByFirstName(String firstName);
}
