package com.example.employeemanagementdepartmentsv.service.impl;

import com.example.employeemanagementdepartmentsv.dto.DepartmentDto;
import com.example.employeemanagementdepartmentsv.entity.Department;
import com.example.employeemanagementdepartmentsv.repository.DepartmentRepo;
import com.example.employeemanagementdepartmentsv.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentImpl implements DepartmentService {

    private final DepartmentRepo departmentRepo;
    private final ModelMapper modelMapper;
    @Override
    public String addDepartment(DepartmentDto dto) {

        if (!departmentRepo.existsByDepId(dto.getDepId())){
            departmentRepo.save(modelMapper.map(dto, Department.class));
            return "Department add successful..";
        }

        return "Department already exists..";

    }
}
