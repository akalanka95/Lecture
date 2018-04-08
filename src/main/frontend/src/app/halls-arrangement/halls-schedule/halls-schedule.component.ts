import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Params} from "@angular/router";
import {TimeTableService} from "../../service/timeTable.service";
import {TimeTable} from "../../timeTable.model";

@Component({
  selector: 'app-halls-schedule',
  templateUrl: './halls-schedule.component.html',
  styleUrls: ['./halls-schedule.component.css']
})
export class HallsScheduleComponent implements OnInit {

  dayHallsTimeTable : TimeTable [] =[];
  day: string = '';
  constructor(private timeTableService: TimeTableService,private route: ActivatedRoute) { }

  ngOnInit() {
      this.day = this.route.snapshot.params['day'];
      console.log(this.day);

      this.route.params.subscribe(
          (params: Params) => {
              this.day = params['day'];
              this.timeTableService.getHallsOnDay(this.day)
                  .subscribe(
                      (dayHallsTimeTable : any[]) => {
                          this.dayHallsTimeTable = dayHallsTimeTable ;
                      },
                      (error) => console.log(error)
                  )
          }
      )
      /*this.timeTableService.getHallsOnDay(this.day)
          .subscribe(
              (dayHallsTimeTable : any[]) => {
                  this.dayHallsTimeTable = dayHallsTimeTable ;
              },
              (error) => console.log(error)
          )*/



  }

}
