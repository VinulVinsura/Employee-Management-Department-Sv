package com.example.employeemanagementdepartmentsv.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;
    private String firstName;
    private String lastName;
    private String email;
    private Long dep_id;
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "role_num", referencedColumnName = "id")
    private Role role;
}

/*
     {
        "firstName":"vinul",
        "lastName":"vinsura",
        "email":"vinul@gmail",
        "dep_id":"STAT 01",
        "role":{
                 "roleId":"SE001",
                 "roleName":"Software Engineer",
                 "description":"Intern"
                }
      }



 */
