package com.akalanka.springangular.lecturemanagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "department_detail")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private Integer id;
    private String departmentName;
    private String description;
    private boolean active;

    public Department(String departmentName, String description, boolean active) {
        this.departmentName = departmentName;
        this.description = description;
        this.active = active;
    }
}
