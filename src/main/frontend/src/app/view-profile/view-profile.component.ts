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
  constructor() {
  }

  ngOnInit() {

  }
    activeTab(text: string,textId: string){
      this.active = text;
      this.activeId = textId;
        /*document.getElementById("script1").remove();
                var script1 = document.createElement("script");
                script1.setAttribute("id", "script1");
                script1.setAttribute("src", "./assets/js/jquery-3.0.0.min.js");
                document.head.appendChild(script1);

                document.getElementById("script2").remove();
                var script2 = document.createElement("script");
                script2.setAttribute("id", "script2");
                script2.setAttribute("src", "./assets/js/main.js");
                document.head.appendChild(script2);
        */

    }

}
