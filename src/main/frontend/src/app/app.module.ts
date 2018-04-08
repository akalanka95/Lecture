import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app.routing';
import { ComponentsModule } from './components/components.module';

import { AppComponent } from './app.component';

import { DashboardComponent } from './dashboard/dashboard.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { TableListComponent } from './table-list/table-list.component';
import { TypographyComponent } from './typography/typography.component';
import { IconsComponent } from './icons/icons.component';
import { MapsComponent } from './maps/maps.component';
import { NotificationsComponent } from './notifications/notifications.component';
import { UpgradeComponent } from './upgrade/upgrade.component';
import {DepartmentService} from "./service/department.service";
import { ViewProfileComponent } from './view-profile/view-profile.component';
import {LectureService} from "./service/lecture.service";
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { DepartmentComponent } from './view-profile/department/department.component';
import { LectureComponent } from './view-profile/lecture/lecture.component';
import { AddDepartmentComponent } from './view-profile/department/add-department/add-department.component';
import {CommonModule} from "@angular/common";
import { TimeTableComponent } from './time-table/time-table.component';
import { DepartmentTimeComponent } from './time-table/department-time/department-time.component';
import {TimeTableService} from "./service/timeTable.service";
import { HallsArrangementComponent } from './halls-arrangement/halls-arrangement.component';
import { HallsScheduleComponent } from './halls-arrangement/halls-schedule/halls-schedule.component';
import { LectureArrangementComponent } from './lecture-arrangement/lecture-arrangement.component';
import { LectureScheduleComponent } from './lecture-arrangement/lecture-schedule/lecture-schedule.component';
import { LectureAddingComponent } from './lecture-adding/lecture-adding.component';
import { SemesterSelectComponent } from './lecture-adding/semester-select/semester-select.component';
import { AddFormComponent } from './lecture-adding/semester-select/add-form/add-form.component';
import { AddLectureComponent } from './view-profile/department/add-lecture/add-lecture.component';
import {Lecture} from "./lecture.model";

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    UserProfileComponent,
    TableListComponent,
    TypographyComponent,
    IconsComponent,
    MapsComponent,
    NotificationsComponent,
    UpgradeComponent,
    ViewProfileComponent,
    PageNotFoundComponent,
    DepartmentComponent,
    LectureComponent,
    AddDepartmentComponent,
    TimeTableComponent,
    DepartmentTimeComponent,
    HallsArrangementComponent,
    HallsScheduleComponent,
    LectureArrangementComponent,
    LectureScheduleComponent,
    LectureAddingComponent,
    SemesterSelectComponent,
    AddFormComponent,
    AddLectureComponent,

  ],
  imports: [
      CommonModule,
    FormsModule,
    HttpModule,
    ComponentsModule,
    RouterModule,
    AppRoutingModule
  ],
  providers: [DepartmentService,LectureService,TimeTableService],
  bootstrap: [AppComponent]
})
export class AppModule { }
