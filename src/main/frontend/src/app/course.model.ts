import {Department} from "./department.model";
import {Lecture} from "./lecture.model";
import {Semester} from "./semester.model";

export class Course{
    public id: number;
    public courseCode: string;
    public courseName: String;
    public year: number;
    public department: Department;
    public semester: Semester;
    public lecture: Lecture;
    public description: string;


    constructor(id: number, courseCode: string, courseName: String, year: number, department: Department, semester: Semester, lecture: Lecture, description: string) {
        this.id = id;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.year = year;
        this.department = department;
        this.semester = semester;
        this.lecture = lecture;
        this.description = description;
    }
}