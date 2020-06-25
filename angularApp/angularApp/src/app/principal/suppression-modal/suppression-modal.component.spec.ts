import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SuppressionModalComponent } from './suppression-modal.component';

describe('SuppressionModalComponent', () => {
  let component: SuppressionModalComponent;
  let fixture: ComponentFixture<SuppressionModalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SuppressionModalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SuppressionModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
