import {Component, Input, OnInit, ViewChild} from '@angular/core';
import {NgForm} from "@angular/forms";
import {Lecture} from "../../../lecture.model";
import {DepartmentService} from "../../../service/department.service";
import {Department} from "../../../department.model";
import {LectureService} from "../../../service/lecture.service";
import {ActivatedRoute, Params, Router} from "@angular/router";
import {UploadMetadata} from "angular2-image-upload";
import {Http} from "@angular/http";

@Component({
  selector: 'app-add-lecture',
  templateUrl: './add-lecture.component.html',
  styleUrls: ['./add-lecture.component.css']
})
export class AddLectureComponent implements OnInit {

  @ViewChild('f') addLectureForm: NgForm;
  departmentList: Department [] =[];
  passedLecture: Lecture;
  addOrEdit: boolean = true;
  buttonName: string ='Add Lecture';
  isFocused: string = " ";
  lectureId: number;
  lectureName: string;
  lectureEmail: string;
  lectureAddres:string;
  lectureContact: string ;
  lectureRole: string ;
  lectureDepartment: Department = null;
  lectureDetails: string ;
  lectureImageUrl: string;
  lectureObject: Lecture = new Lecture();

  selectedFile: File = null;
  fullImagePath: string = "../assets/img/lecture/";


    constructor(private departmentService: DepartmentService,
              private lectureService: LectureService,
              private route: ActivatedRoute,
              private router: Router,
                private http: Http) { }

  ngOnInit() {
    /*this.lectureObject.fullName = this.lectureName;*/
      this.passedLecture = this.lectureService.passingLecture;
      console.log(this.passedLecture);
      if(this.passedLecture!=null){
          this.isFocused = "is-focused";
          this.buttonName = "Update";
          this.addOrEdit = false;
          this.lectureId = this.passedLecture.id;
          this.lectureName = this.passedLecture.fullName;
          this.lectureRole = this.passedLecture.role;
          this.lectureEmail = this.passedLecture.email;
          this.lectureAddres = this.passedLecture.address;
          this.lectureContact = this.passedLecture.contact;

      }
      this.departmentService.getListOfDepartments()
          .subscribe(
              (departmentList: any[]) => {
                  this.departmentList = departmentList;
              },
              (error) => console.log(error)
          );

      /*this.route.params.subscribe(
          (params: Params) => {
            this.editLecture = params['lecture'];
            console.log(this.editLecture);
          }
      )*/
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
      this.lectureObject.imageUrl = this.lectureImageUrl;
      console.log(this.lectureObject);

      const fd = new FormData();
      fd.append('file',this.selectedFile);
      this.http.post('api/uploades/images',fd)
          .subscribe(res => {
              console.log(res);
              }
          );

      if(this.addOrEdit){
          this.lectureService.postNewLecture(this.lectureObject)
              .subscribe(
                  (response) => console.log(response),
                  (error) => console.log(error)
              );

          this.addLectureForm.resetForm();
      }else{
          this.lectureObject.id = this.lectureId;
          this.lectureService.updateLecture(this.lectureObject)
              .subscribe(
                  (response) => console.log(response),
                  (error) => console.log(error)
              );
      }


  }

  selectDepartment(departments){
    console.log(departments);
    this.lectureDepartment = departments;
  }

    onFileSelcted(event){
      this.selectedFile = <File>event.target.files[0];
      console.log(this.selectedFile);
    }

    /*onBeforeUpload = (metadata: UploadMetadata) => {
      console.log(metadata.file.name);
      metadata.file.webkitRelativePath

        /!* if (this.fileCounter % 2 === 0) {
             metadata.abort = true;
         } else {
             // mutate the file or replace it entirely - metadata.file
             metadata.url = 'http://somewhereelse.com'
         }*!/
        console.log(metadata);
    };*/

}
