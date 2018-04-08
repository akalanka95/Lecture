import { Component, OnInit } from '@angular/core';
import {TimeTableService} from "../service/timeTable.service";
import {TimeTable} from "../timeTable.model";

@Component({
  selector: 'app-time-table',
  templateUrl: './time-table.component.html',
  styleUrls: ['./time-table.component.css']
})
export class TimeTableComponent implements OnInit {


  constructor() { }

  ngOnInit() {}

}
