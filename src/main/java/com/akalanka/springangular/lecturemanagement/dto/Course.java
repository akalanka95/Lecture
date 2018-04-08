package com.akalanka.springangular.lecturemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private Integer id;

    private String courseCode;
    private String courseName;
    private int year;

    @ManyToOne
    private Semester semester;

    @ManyToOne
    private Department department;

    private String description;

    @ManyToOne
    private Lecture lecture;

    public Course(String courseCode, String courseName, int year, Semester semester, Department department, String description) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.year = year;
        this.semester = semester;
        this.department = department;
        this.description = description;
    }
}
