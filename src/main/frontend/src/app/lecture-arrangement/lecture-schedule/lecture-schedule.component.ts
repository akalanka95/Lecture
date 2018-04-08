import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Params} from "@angular/router";
import {TimeTableService} from "../../service/timeTable.service";
import {TimeTable} from "../../timeTable.model";

@Component({
  selector: 'app-lecture-schedule',
  templateUrl: './lecture-schedule.component.html',
  styleUrls: ['./lecture-schedule.component.css']
})
export class LectureScheduleComponent implements OnInit {

    lecturesTimeTable : TimeTable [] =[];
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
                      (lecturesTimeTable  : any[]) => {
                          this.lecturesTimeTable  = lecturesTimeTable  ;
                      },
                      (error) => console.log(error)
                  )
          }
      )
  }

}
