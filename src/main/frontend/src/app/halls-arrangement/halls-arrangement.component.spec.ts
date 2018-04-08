import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HallsArrangementComponent } from './halls-arrangement.component';

describe('HallsArrangementComponent', () => {
  let component: HallsArrangementComponent;
  let fixture: ComponentFixture<HallsArrangementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HallsArrangementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HallsArrangementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
