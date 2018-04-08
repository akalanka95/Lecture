import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DepartmentTimeComponent } from './department-time.component';

describe('DepartmentTimeComponent', () => {
  let component: DepartmentTimeComponent;
  let fixture: ComponentFixture<DepartmentTimeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DepartmentTimeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DepartmentTimeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
