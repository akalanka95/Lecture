import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import "rxjs/add/operator/map";

@Injectable()
export class TimeTableService{

    constructor(private http: Http){

    }

    getListOfTimeTables(id: number){
        console.log(id);
        return this.http.get('/api/timesTables/'+id).map(response => response.json());
    }
    getHallsOnDay(day: string){
        console.log(day);
        return this.http.get('/api/timesTables/findBy/'+day).map(response => response.json());

    }

}