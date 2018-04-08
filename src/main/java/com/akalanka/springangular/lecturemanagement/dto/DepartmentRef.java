package com.akalanka.springangular.lecturemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentRef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private Integer id;
    @NotBlank(message = "Please enter the Full Name!")
    private String name;
    @NotBlank(message = "Please enter the Address!")
    private String address;
    @NotBlank(message = "Please enter the Email!")
    @Email
    private String email;
    @NotBlank(message = "Please enter the Contact Number!")
    private String contact;

    @ManyToOne
    private Department department;

    private int semester;
    private String imageUrl;
    private boolean active;

    @Transient
    private MultipartFile file;
}
