package com.example.employeemanagementdepartmentsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private Long id;
    private String depId;
    private String depName;
    private String description;

}
