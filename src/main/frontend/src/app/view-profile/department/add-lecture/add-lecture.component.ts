import {Component, OnInit, ViewChild} from '@angular/core';
import {NgForm} from "@angular/forms";
import {Lecture} from "../../../lecture.model";
import {DepartmentService} from "../../../service/department.service";
import {Department} from "../../../department.model";
import {LectureService} from "../../../service/lecture.service";
import {ActivatedRoute, Params, Router} from "@angular/router";

@Component({
  selector: 'app-add-lecture',
  templateUrl: './add-lecture.component.html',
  styleUrls: ['./add-lecture.component.css']
})
export class AddLectureComponent implements OnInit {

  @ViewChild('f') addLectureForm: NgForm;
  departmentList: Department [] =[];
  editLecture: Lecture;
  lectureName: string;
  lectureEmail: string;
  lectureAddres:string;
  lectureContact: string ;
  lectureRole: string ;
  lectureDepartment: Department = null;
  lectureDetails: string ;
  lectureObject: Lecture = new Lecture();

  constructor(private departmentService: DepartmentService,
              private lectureService: LectureService,
              private route: ActivatedRoute,
              private router: Router) { }

  ngOnInit() {
    /*this.lectureObject.fullName = this.lectureName;*/
      this.departmentService.getListOfDepartments()
          .subscribe(
              (departmentList: any[]) => {
                  this.departmentList = departmentList;
              },
              (error) => console.log(error)
          );

      this.route.params.subscribe(
          (params: Params) => {
            this.editLecture = params['lecture'];
            console.log(this.editLecture);
          }
      )
      /*this.lectureService.newEmitter
          .subscribe(
              (editLecture : Lecture) => {
                this.editLecture = editLecture;
                console.log(this.editLecture);
                this.lectureRole = this.editLecture.role;
                console.log(this.lectureRole);
              }
          );*/
      console.log(this.lectureRole);
      console.log(this.editLecture);

  }
  onSubmit(form: NgForm){
      console.log(form)
      console.log(this.lectureDepartment);
      console.log(this.lectureObject);
      this.lectureObject.fullName = this.lectureName;
      this.lectureObject.department = this.lectureDepartment;
      this.lectureObject.contact = this.lectureContact;
      this.lectureObject.address = this.lectureAddres;
      this.lectureObject.email = this.lectureEmail;
      this.lectureObject.role = this.lectureRole;
      this.lectureObject.active = true;
      console.log(this.lectureObject);

      this.lectureService.postNewLecture(this.lectureObject)
          .subscribe(
              (response) => console.log(response),
              (error) => console.log(error)
          );
      this.addLectureForm.resetForm();
  }
  selectDepartment(departments){
    console.log(departments);
    this.lectureDepartment = departments;
  }

}
