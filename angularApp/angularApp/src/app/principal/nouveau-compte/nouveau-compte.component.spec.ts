import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NouveauCompteComponent } from './nouveau-compte.component';

describe('NouveauCompteComponent', () => {
  let component: NouveauCompteComponent;
  let fixture: ComponentFixture<NouveauCompteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NouveauCompteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NouveauCompteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
