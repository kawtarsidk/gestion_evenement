import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifierEvenementComponent } from './modifier-evenement.component';

describe('ModifierEvenementComponent', () => {
  let component: ModifierEvenementComponent;
  let fixture: ComponentFixture<ModifierEvenementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifierEvenementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifierEvenementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
