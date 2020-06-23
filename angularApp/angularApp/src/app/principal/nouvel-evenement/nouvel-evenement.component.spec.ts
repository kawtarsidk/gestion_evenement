import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NouvelEvenementComponent } from './nouvel-evenement.component';

describe('NouvelEvenementComponent', () => {
  let component: NouvelEvenementComponent;
  let fixture: ComponentFixture<NouvelEvenementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NouvelEvenementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NouvelEvenementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
