import { Component, OnInit } from '@angular/core';
import {Lecture} from "../../lecture.model";
import {LectureService} from "../../service/lecture.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-lecture',
  templateUrl: './lecture.component.html',
  styleUrls: ['./lecture.component.css']
})
export class LectureComponent implements OnInit {
  lectures: Lecture [] = [] ;

  constructor(private lectureService: LectureService,
              private router: Router,
              private route: ActivatedRoute) { }

  ngOnInit() {
      this.lectureService.getListOfLectures()
          .subscribe(
              (lecture: any[]) => {
                  this.lectures =lecture;
              },
              (error) => console.log(error)
          )
  }

  onEditLecture(lecture: Lecture){
      /*return this.router.navigate(['edit','getting'],{relativeTo: this.route});
      *//*this.lectureService.newEmitter.emit(lecture);*/


  }

}
