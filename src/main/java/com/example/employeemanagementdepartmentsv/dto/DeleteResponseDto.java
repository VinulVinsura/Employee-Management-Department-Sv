package com.example.employeemanagementdepartmentsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteResponseDto {
    private Long id;
    private String status;
}
