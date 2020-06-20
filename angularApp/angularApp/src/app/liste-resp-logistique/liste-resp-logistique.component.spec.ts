import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeRespLogistiqueComponent } from './liste-resp-logistique.component';

describe('ListeRespLogistiqueComponent', () => {
  let component: ListeRespLogistiqueComponent;
  let fixture: ComponentFixture<ListeRespLogistiqueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListeRespLogistiqueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeRespLogistiqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
