package com.example.employeemanagementdepartmentsv.repository;

import com.example.employeemanagementdepartmentsv.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {

    boolean existsByDepId(String id);
    Department findByDepId(String depId);

}
