package com.example.employeemanagementdepartmentsv.service;

import com.example.employeemanagementdepartmentsv.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    String addDepartment(DepartmentDto dto);
    List<DepartmentDto> getAllDepartment();
    DepartmentDto getDepartmentById(String depId);
    String deleteById(Long id);
}
