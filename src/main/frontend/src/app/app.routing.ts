import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule  } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';

import { DashboardComponent } from './dashboard/dashboard.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { TableListComponent } from './table-list/table-list.component';
import { TypographyComponent } from './typography/typography.component';
import { IconsComponent } from './icons/icons.component';
import { MapsComponent } from './maps/maps.component';
import { NotificationsComponent } from './notifications/notifications.component';
import { UpgradeComponent } from './upgrade/upgrade.component';
import {ViewProfileComponent} from "./view-profile/view-profile.component";
import {PageNotFoundComponent} from "./page-not-found/page-not-found.component";
import {DepartmentComponent} from "./view-profile/department/department.component";
import {LectureComponent} from "./view-profile/lecture/lecture.component";
import {AddDepartmentComponent} from "./view-profile/department/add-department/add-department.component";
import {TimeTableComponent} from "./time-table/time-table.component";
import {DepartmentTimeComponent} from "./time-table/department-time/department-time.component";
import {HallsArrangementComponent} from "./halls-arrangement/halls-arrangement.component";
import {HallsScheduleComponent} from "./halls-arrangement/halls-schedule/halls-schedule.component";
import {LectureArrangementComponent} from "./lecture-arrangement/lecture-arrangement.component";
import {LectureScheduleComponent} from "./lecture-arrangement/lecture-schedule/lecture-schedule.component";
import {LectureAddingComponent} from "./lecture-adding/lecture-adding.component";
import {SemesterSelectComponent} from "./lecture-adding/semester-select/semester-select.component";
import {AddFormComponent} from "./lecture-adding/semester-select/add-form/add-form.component";
import {AddLectureComponent} from "./view-profile/department/add-lecture/add-lecture.component";

const routes: Routes =[
    { path: 'dashboard',      component: DashboardComponent },
    { path: 'view-profile',   component: ViewProfileComponent , children : [
            {path : 'department', component : DepartmentComponent},
            {path : 'lecture', component : LectureComponent},
            {path : 'lecture/edit', component : AddLectureComponent},
            {path : 'departmentRef', component : LectureComponent},
            {path : 'add/department', component : AddDepartmentComponent},
            {path : 'add/lecture', component : AddLectureComponent},
            {path : 'add/departmentRef', component : LectureComponent}
        ] },
    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'time-table',   component: TimeTableComponent , children : [
            {path : 'view/cis/:id', component : DepartmentTimeComponent},
            {path : 'view/pst/:id', component : DepartmentTimeComponent},
            {path : 'view/nr/:id', component : DepartmentTimeComponent}
        ]},
    { path: 'halls-arrangement',   component: HallsArrangementComponent, children : [
            {path : 'view/:day', component : HallsScheduleComponent}
        ]},
    { path: 'lecture-arrangement',   component: LectureArrangementComponent, children : [
            {path : 'view/:day', component : LectureScheduleComponent}
        ]},
    { path: 'add-new-lecture',   component: LectureAddingComponent, children : [
            {path : 'add/:id', component : SemesterSelectComponent, children :[
                    {path : 'semester/:semId', component : AddFormComponent}
                ]},
        ]},
    { path: 'table-list',     component: TableListComponent },
    { path: 'typography',     component: TypographyComponent },
    { path: 'icons',          component: IconsComponent },
    { path: 'maps',           component: MapsComponent },
    { path: 'notifications',  component: NotificationsComponent },
    { path: 'upgrade',        component: UpgradeComponent },
    { path: '',               redirectTo: 'dashboard', pathMatch: 'full' },
    { path: 'not-found',      component: PageNotFoundComponent },
    { path: '**',             redirectTo: 'not-found' }
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  exports: [
  ],
})
export class AppRoutingModule { }
