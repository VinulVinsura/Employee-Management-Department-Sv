package com.example.employeemanagementdepartmentsv.controller;

import com.example.employeemanagementdepartmentsv.dto.DepartmentDto;
import com.example.employeemanagementdepartmentsv.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@CrossOrigin
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    // add department method
    @PostMapping("/add")
    public ResponseEntity<String> addDepartment(@RequestBody DepartmentDto dto){

        return ResponseEntity.ok(departmentService.addDepartment(dto));
    }

    // get all departments
    @GetMapping("/get-all")
    public ResponseEntity<List<DepartmentDto>> getAllDepartment(){
        return ResponseEntity.ok(departmentService.getAllDepartment());
    }

    // get department by departmentId
    @GetMapping("/get-by-depId/{depId}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable String depId){
        return ResponseEntity.ok(departmentService.getDepartmentById(depId));
    }
}
