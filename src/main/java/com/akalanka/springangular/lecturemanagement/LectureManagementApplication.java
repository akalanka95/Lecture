package com.akalanka.springangular.lecturemanagement;

import com.akalanka.springangular.lecturemanagement.dto.*;
import com.akalanka.springangular.lecturemanagement.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;

@SpringBootApplication
public class LectureManagementApplication implements CommandLineRunner {
	@Autowired
	private TimeService timeService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private LectureHallService lectureHallService;
	@Autowired
	private SemesterService semesterService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private LectureService lectureService;
	@Autowired
	private TimeTableService timeTableService;

	private Course course;
	private Department department;
	private Lecture lecture;
	private Semester semester;
	private TimeTable timeTable;
	private Time time;
	private LectureHall lectureHall;

	public static void main(String[] args) {
		SpringApplication.run(LectureManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		timeService.save(new Time( 1,LocalTime.of(8,00)));
		timeService.save(new Time( LocalTime.of(8,30)));
		timeService.save(new Time( LocalTime.of(9,00)));
		timeService.save(new Time( LocalTime.of(9,30)));
		timeService.save(new Time( LocalTime.of(10,00)));
		timeService.save(new Time( LocalTime.of(10,30)));

		departmentService.save(new Department("Computing and Information System(CIS)"," The degree program has been designed so that the graduates could cater to the growing demand in government and private sector. ",true));
		departmentService.save(new Department("Physical Science And Technology"," Four degree programmes are available for the undergraduates and Mathematics, Statistics, and Management Studies are conducted as supporting tools for the program. ",true));
		departmentService.save(new Department("Sport Sciences and Physical Education","The duration of the degree programmes are four years and at present there is a great demand for the degree programme",true));
		departmentService.save(new Department("Natural Resources","The degree program is designed to cater to the current job market in the fields of Environmental Protection, Natural Resource Management and Conservation, Biodiversity Conservation and Management." ,true));
		departmentService.save(new Department("Food Science and Technology"," Degree program is designed to expand the understanding of the biological, microbiological, chemical, physical, sensory, nutritional, and engineering properties of food/ food commodities and their processing technologies.",true));

		lectureHallService.save(new LectureHall("CIS Lab","CIS Computer Laboratory","CIS Lab",80));
		lectureHallService.save(new LectureHall("NLH","New lecture hall","NLH",100));
		lectureHallService.save(new LectureHall("ELTD","Confortable lecture hall","ELTD",90));
		lectureHallService.save(new LectureHall("Z-9","Old lecture hall","Z-9",60));
		lectureHallService.save(new LectureHall("LT-202","A lecture hall inside the faculty","LT-202",100));
		lectureHallService.save(new LectureHall("LT-104","A specific lecture hall in the faculty","LT_104",70));

		semesterService.save(new Semester("Semester one"));
		semesterService.save(new Semester("Semester two"));
		semesterService.save(new Semester("Semester three"));
		semesterService.save(new Semester("Semester four"));


		lecture = new Lecture();

		lecture.setAddress("kandy");
		lecture.setContact("+94714431192");
		department = departmentService.findById(1);
		lecture.setDepartment(department);
		lecture.setEmail("kumara@appsc.sab.ac.lk");
		lecture.setFullName("Dr.B.T.G.S.Kumara");
		lecture.setRole("Head of the department");
		lecture.setActive(true);

		lectureService.save(lecture);

		lecture = new Lecture();

		lecture.setAddress("Colombo");
		lecture.setContact("+94717851500");
		department = departmentService.findById(1);
		lecture.setDepartment(department);
		lecture.setEmail("priyan@appsc.sab.ac.lk");
		lecture.setFullName("Mr.S.Vasanthapriyan");
		lecture.setRole("Senior Lecturer");
		lecture.setActive(true);

		lectureService.save(lecture);


		lecture = new Lecture();

		lecture.setAddress("Ampara");
		lecture.setContact("+94718080883");
		department = departmentService.findById(1);
		lecture.setDepartment(department);
		lecture.setEmail("rk@appsc.sab.ac.lk");
		lecture.setFullName("Mr.R.K.A.R.Kariapper");
		lecture.setRole("Senior Lecturer");
		lecture.setActive(true);

		lectureService.save(lecture);

		lecture = new Lecture();

		lecture.setAddress("Gampaha");
		lecture.setContact("+94453454519");
		department = departmentService.findById(1);
		lecture.setDepartment(department);
		lecture.setEmail("sugeeswarilekamge@appsc.sab.ac.lk");
		lecture.setFullName("Mrs.Sugeeswari Lekamge");
		lecture.setRole("Lecturer");
		lecture.setActive(true);

		lectureService.save(lecture);

		course = new Course();

		course.setId(1);
		course.setCourseCode("ISS0021");
		course.setCourseName("Emergency Technology");
		course.setDescription("This is regarding sstem intergation");
		course.setYear(2);
		System.out.println("department ...............");
		department = departmentService.findById(1);
		course.setDepartment(department);

		lecture = lectureService.findById(1);
		course.setLecture(lecture);

		semester = semesterService.findById(2);
		course.setSemester(semester);
		courseService.save(course);


		timeTable = new TimeTable();

		timeTable.setDay("Monday");
		timeTable.setActive(true);
		timeTable.setState("old");

		time =timeService.findById(3);
		timeTable.setStartTime(time);

		time =timeService.findById(6);
		timeTable.setEndTime(time);

		course =courseService.findById(1);
		timeTable.setCourse(course);

		department = departmentService.findById(1);
		timeTable.setDepartment(department);

		lecture = lectureService.findById(4);
		timeTable.setLecture(lecture);

		lectureHall = lectureHallService.findById(3);
		timeTable.setLectureHall(lectureHall);

		semester = semesterService.findById(2);
		timeTable.setSemester(semester);

		timeTableService.save(timeTable);


		timeTable = new TimeTable();

		timeTable.setDay("Tuesday");
		timeTable.setActive(true);
		timeTable.setState("old");

		time =timeService.findById(3);
		timeTable.setStartTime(time);

		time =timeService.findById(6);
		timeTable.setEndTime(time);

		course =courseService.findById(1);
		timeTable.setCourse(course);

		department = departmentService.findById(2);
		timeTable.setDepartment(department);

		lecture = lectureService.findById(4);
		timeTable.setLecture(lecture);

		lectureHall = lectureHallService.findById(3);
		timeTable.setLectureHall(lectureHall);

		semester = semesterService.findById(2);
		timeTable.setSemester(semester);

		timeTableService.save(timeTable);


		timeTable = new TimeTable();

		timeTable.setDay("Tuesday");
		timeTable.setActive(true);
		timeTable.setState("old");

		time =timeService.findById(1);
		timeTable.setStartTime(time);

		time =timeService.findById(3);
		timeTable.setEndTime(time);

		course =courseService.findById(1);
		timeTable.setCourse(course);

		department = departmentService.findById(1);
		timeTable.setDepartment(department);

		lecture = lectureService.findById(4);
		timeTable.setLecture(lecture);

		lectureHall = lectureHallService.findById(3);
		timeTable.setLectureHall(lectureHall);

		semester = semesterService.findById(2);
		timeTable.setSemester(semester);

		timeTableService.save(timeTable);

	}
}
