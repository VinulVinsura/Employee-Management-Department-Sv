package com.example.employeemanagementdepartmentsv.service.impl;

import com.example.employeemanagementdepartmentsv.dto.RoleDto;
import com.example.employeemanagementdepartmentsv.entity.Role;
import com.example.employeemanagementdepartmentsv.repository.RoleRepo;
import com.example.employeemanagementdepartmentsv.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepo roleRepo;
    private final ModelMapper modelMapper;
    @Override
    public String addRole(RoleDto roleDto) {
        if (!roleRepo.existsByRoleId(roleDto.getRoleId())){
            roleRepo.save(modelMapper.map(roleDto, Role.class));
            return "Role add success";
        }
        return "Role is already exist";
    }
}
