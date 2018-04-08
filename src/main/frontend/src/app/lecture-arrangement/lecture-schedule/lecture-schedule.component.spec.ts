import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LectureScheduleComponent } from './lecture-schedule.component';

describe('LectureScheduleComponent', () => {
  let component: LectureScheduleComponent;
  let fixture: ComponentFixture<LectureScheduleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LectureScheduleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LectureScheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
