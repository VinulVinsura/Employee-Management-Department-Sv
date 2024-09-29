package com.example.employeemanagementdepartmentsv.controller;

import com.example.employeemanagementdepartmentsv.dto.RoleDto;
import com.example.employeemanagementdepartmentsv.entity.Role;
import com.example.employeemanagementdepartmentsv.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/role")
public class RoleController {
    private final RoleService roleService;

    @PostMapping("/add-role")
    public ResponseEntity<String> addRole(@RequestBody RoleDto roleDto){
        return ResponseEntity.ok(roleService.addRole(roleDto));
    }

    @GetMapping("/get-Roles")
    public ResponseEntity<List<RoleDto>> getAllRoles(){
        return ResponseEntity.ok(roleService.getAllRoles());
    }
}
