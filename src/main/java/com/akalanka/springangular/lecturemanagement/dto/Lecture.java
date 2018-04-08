package com.akalanka.springangular.lecturemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private Integer id;
    @NotEmpty(message = "Please enter the Full Name!")
    private String fullName;
    @NotEmpty(message = "Please enter the Address!")
    private String Address;
    @NotEmpty(message = "Please enter the Email!")
    @Email
    private String email;
    @NotEmpty(message = "Please enter the Contact Number!")
    private String contact;
    @NotEmpty(message = "Please enter the Role!")
    private String role;
    @OneToOne
    private Department department;
    private String imageUrl;
    private boolean active;
    @Transient
    private MultipartFile file;


}
