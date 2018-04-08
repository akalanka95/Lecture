import { Component, OnInit } from '@angular/core';
import {TimeTableService} from "../../service/timeTable.service";
import {TimeTable} from "../../timeTable.model";
import {ActivatedRoute, Params} from "@angular/router";

@Component({
  selector: 'app-department-time',
  templateUrl: './department-time.component.html',
  styleUrls: ['./department-time.component.css']
})
export class DepartmentTimeComponent implements OnInit {

  timeTables: TimeTable [] = [];
  departmentId: number = 1;
  constructor(private timeTableService: TimeTableService,private route: ActivatedRoute) { }


  ngOnInit() {
      this.departmentId = +this.route.snapshot.params['id'];

      this.route.params.subscribe(
          (params: Params) => {
              this.departmentId = +params['id']
          }
      )
      console.log(this.departmentId);

      this.timeTableService.getListOfTimeTables(this.departmentId)
          .subscribe(
              (timeTables: any[]) => {
                  this.timeTables = timeTables;
              },
              (error) => console.log(error)
          )
  }






}
