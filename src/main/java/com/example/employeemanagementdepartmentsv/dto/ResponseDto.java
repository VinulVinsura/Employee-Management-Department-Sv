package com.example.employeemanagementdepartmentsv.dto;

import com.example.employeemanagementdepartmentsv.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private Long emp_id;
    private String email;
    private Long dep_id;
    private Role roleObj;
}
