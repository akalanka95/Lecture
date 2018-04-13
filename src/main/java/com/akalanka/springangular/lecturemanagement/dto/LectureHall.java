package com.akalanka.springangular.lecturemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lectureHall_details")
public class LectureHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private Integer id;
    private String Name;
    private String code;
    private String description;
    private int capacity;

    public LectureHall(String name, String code, String description, int capacity) {
        Name = name;
        this.code = code;
        this.description = description;
        this.capacity = capacity;
    }
}
