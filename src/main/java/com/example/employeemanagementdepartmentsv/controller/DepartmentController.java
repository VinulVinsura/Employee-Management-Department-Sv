package com.example.employeemanagementdepartmentsv.controller;

import com.example.employeemanagementdepartmentsv.dto.DepartmentDto;
import com.example.employeemanagementdepartmentsv.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@CrossOrigin
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping("/add")
    public ResponseEntity<String> addDepartment(@RequestBody DepartmentDto dto){

        return ResponseEntity.ok(departmentService.addDepartment(dto));
    }
}
