import {EventEmitter, Injectable} from "@angular/core";
import {Http} from "@angular/http";
import "rxjs/add/operator/map";
import {Lecture} from "../lecture.model";

@Injectable()
export class LectureService{

    newEmitter = new EventEmitter<Lecture>();
    passingLecture: Lecture;

    constructor(private http: Http){

    }

    getListOfLectures(){
        return this.http.get('/api/lectures/').map(response => response.json());
    }
    postNewLecture(newLecture: Lecture){
        return this.http.post('/api/lectures/save',newLecture);

    }

    updateLecture(updateLecture: Lecture){
        return this.http.put('/api/lectures/update',updateLecture);

    }


}