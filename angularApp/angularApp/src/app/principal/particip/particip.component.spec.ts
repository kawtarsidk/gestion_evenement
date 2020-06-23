import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParticipComponent } from './particip.component';

describe('ParticipComponent', () => {
  let component: ParticipComponent;
  let fixture: ComponentFixture<ParticipComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParticipComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParticipComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
