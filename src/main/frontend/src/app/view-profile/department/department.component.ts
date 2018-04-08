import { Component, OnInit } from '@angular/core';
import {Department} from "../../department.model";
import {DepartmentService} from "../../service/department.service";

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {
    departments: Department[] = [] ;

  constructor(private departmentService : DepartmentService) { }

  ngOnInit() {
      this.departmentService.getListOfDepartments()
          .subscribe(
              (departments: any[]) => {
                  this.departments = departments;
              },
              (error) => console.log(error)
          )
  }

}
