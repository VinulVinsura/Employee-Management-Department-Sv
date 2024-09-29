package com.example.employeemanagementdepartmentsv.service;

import com.example.employeemanagementdepartmentsv.dto.RoleDto;
import com.example.employeemanagementdepartmentsv.entity.Role;

import java.security.SecureRandom;
import java.util.List;

public interface RoleService {
    String addRole(RoleDto roleDto);
    List<RoleDto> getAllRoles();
    String deleteRoleById(Long id);
}
