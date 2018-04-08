import { Component, OnInit } from '@angular/core';
import {DepartmentService} from "../service/department.service";
import {Department} from "../department.model";
import {Lecture} from "../lecture.model";
import {LectureService} from "../service/lecture.service";

@Component({
  selector: 'app-view-profile',
  templateUrl: './view-profile.component.html',
  styleUrls: ['./view-profile.component.css']
})
export class ViewProfileComponent implements OnInit {

  active: string = '';
  activeId: string = '';
  constructor() { }

  ngOnInit() {

  }
    activeTab(text: string,textId: string){
      this.active = text;
      this.activeId = textId;
    }

}
