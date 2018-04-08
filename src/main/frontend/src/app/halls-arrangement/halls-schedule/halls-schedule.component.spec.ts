import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HallsScheduleComponent } from './halls-schedule.component';

describe('HallsScheduleComponent', () => {
  let component: HallsScheduleComponent;
  let fixture: ComponentFixture<HallsScheduleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HallsScheduleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HallsScheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
