package com.akalanka.springangular.lecturemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TIMETABLE_DETAILS ")
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private int id;
    private String day;
    private boolean active;
    private String state;

    @ManyToOne
    private Course course;
    @ManyToOne
    private Lecture lecture;
    @ManyToOne
    private LectureHall lectureHall;
    @ManyToOne
    private Department department;
    @ManyToOne
    private Semester semester;
    @ManyToOne
    private Time startTime;
    @ManyToOne
    private Time endTime;

}
