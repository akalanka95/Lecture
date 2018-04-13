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
  constructor(private timeTableService: TimeTableService,private route: ActivatedRoute) {


      /*document.getElementById("script1").remove();
      var script1 = document.createElement("script");
      script1.setAttribute("id", "script1");
      script1.setAttribute("src", "./assets/js/jquery-3.0.0.min.js");
      document.head.appendChild(script1);*/

      /*document.getElementById("script2").remove();
      var script2 = document.createElement("script");
      script2.setAttribute("id", "script2");
      script2.setAttribute("src", "./assets/js/main.js");
      document.head.appendChild(script2);*/
  }


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
