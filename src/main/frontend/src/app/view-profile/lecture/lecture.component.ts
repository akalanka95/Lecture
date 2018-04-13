import {Component, OnDestroy, OnInit} from '@angular/core';
import {Lecture} from "../../lecture.model";
import {LectureService} from "../../service/lecture.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-lecture',
  templateUrl: './lecture.component.html',
  styleUrls: ['./lecture.component.css']
})
export class LectureComponent implements OnInit,OnDestroy {

    passLecture: Lecture;
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
      this.passLecture =lecture;
      return this.router.navigate(['edit'],{relativeTo: this.route});
      /*this.lectureService.newEmitter.emit(lecture);*/
  }

    ngOnDestroy(): void {
      this.lectureService.passingLecture = this.passLecture;
    }

}
