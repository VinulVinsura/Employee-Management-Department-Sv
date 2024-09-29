package com.example.employeemanagementdepartmentsv.repository;

import com.example.employeemanagementdepartmentsv.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
    boolean existsByRoleId(String roleId);
}
