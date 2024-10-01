package com.example.employeemanagementdepartmentsv.service;
import com.example.employeemanagementdepartmentsv.dto.DeleteResponseDto;
import com.example.employeemanagementdepartmentsv.dto.EmployeeDto;
import com.example.employeemanagementdepartmentsv.dto.ResponseDto;

import java.util.List;

public interface EmployeeService {
    ResponseDto addEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getEmployees();
    DeleteResponseDto deleteEmployee(Long id);
    EmployeeDto findById(Long id);
    List<EmployeeDto> findByFirstName(String firstName);
}
