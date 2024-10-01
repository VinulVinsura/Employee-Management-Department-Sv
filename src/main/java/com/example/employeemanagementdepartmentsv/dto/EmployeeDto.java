package com.example.employeemanagementdepartmentsv.dto;

import com.example.employeemanagementdepartmentsv.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDto {
    private Long emp_id;
    private String firstName;
    private String lastName;
    private String email;
    private Long dep_id;
    private Role role;


}
