package com.example.employeemanagementdepartmentsv.controller;

import com.example.employeemanagementdepartmentsv.dto.DeleteResponseDto;
import com.example.employeemanagementdepartmentsv.dto.EmployeeDto;
import com.example.employeemanagementdepartmentsv.dto.ResponseDto;
import com.example.employeemanagementdepartmentsv.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp-controller")
@CrossOrigin
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    @PostMapping("/add-employee")
    public ResponseEntity<ResponseDto> addEmployee(@RequestBody EmployeeDto employeeDto){
        System.out.println("vinul");
        ResponseDto responseDto = employeeService.addEmployee(employeeDto);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/get-employees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployee(){

        return ResponseEntity.ok(employeeService.getEmployees());
    }

    @DeleteMapping("/delete-employee/{id}")
    public ResponseEntity<DeleteResponseDto> deleteEmployee(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.deleteEmployee(id));
    }

    @GetMapping("/findBy-id/{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable Long id){
        return ResponseEntity.ok(employeeService.findById(id));
    }
    @GetMapping("/findBy-firstName/{firstName}")
    public ResponseEntity<List<EmployeeDto>> findByFirstName(@PathVariable String firstName){
          return ResponseEntity.ok(employeeService.findByFirstName(firstName));
    }
}
