import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LectureArrangementComponent } from './lecture-arrangement.component';

describe('LectureArrangementComponent', () => {
  let component: LectureArrangementComponent;
  let fixture: ComponentFixture<LectureArrangementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LectureArrangementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LectureArrangementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
