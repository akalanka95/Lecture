import {Department} from "./department.model";

export class Lecture{
    public id: number;
    public fullName: string;
    public address: string;
    public email: string;
    public contact: string;
    public role: string;
    public  department : Department;
    public imageUrl: string;
    public active: boolean;


    constructor() {
    }

    /*constructor(id: number, fullName: string, address: string, email: string, contact: string, role: string, department: Department, imageUrl: string, active: boolean) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.contact = contact;
        this.role = role;
        this.department = department;
        this.imageUrl = imageUrl;
        this.active = active;
    }*/
}