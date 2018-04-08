import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import "rxjs/add/operator/map";

@Injectable()
export class DepartmentService{

    constructor(private http: Http){

    }

    getListOfDepartments(){
        return this.http.get('/api/departments/').map(response => response.json());
    }

}