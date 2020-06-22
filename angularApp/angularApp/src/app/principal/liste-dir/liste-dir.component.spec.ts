import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeDirComponent } from './liste-dir.component';

describe('ListeDirComponent', () => {
  let component: ListeDirComponent;
  let fixture: ComponentFixture<ListeDirComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListeDirComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeDirComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
