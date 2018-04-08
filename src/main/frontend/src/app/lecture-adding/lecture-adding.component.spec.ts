import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LectureAddingComponent } from './lecture-adding.component';

describe('LectureAddingComponent', () => {
  let component: LectureAddingComponent;
  let fixture: ComponentFixture<LectureAddingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LectureAddingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LectureAddingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
