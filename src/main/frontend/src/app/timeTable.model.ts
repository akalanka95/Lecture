import {Lecture} from "./lecture.model";
import {Department} from "./department.model";
import {Semester} from "./semester.model";
import {Course} from "./course.model";
import {Time} from "./time.model";
import {LectureHall} from "./lectureHall.model";

export class TimeTable{
        public id: number;
        public day: string;
        public active: boolean;
        public  state: string;
        public course: Course;
        public lectureHall: LectureHall;
        public lecture: Lecture;
        public department: Department;
        public semester: Semester;
        public startTime: Time;
        public endTime: Time;


    constructor(id: number, day: string, active: boolean, state: string, course: Course, lectureHall: LectureHall, lecture: Lecture, department: Department, semester: Semester, startTime: Time, endTime: Time) {
        this.id = id;
        this.day = day;
        this.active = active;
        this.state = state;
        this.course = course;
        this.lectureHall = lectureHall;
        this.lecture = lecture;
        this.department = department;
        this.semester = semester;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}