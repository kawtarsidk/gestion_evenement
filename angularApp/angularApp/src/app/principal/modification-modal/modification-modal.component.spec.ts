import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ModificationModalComponent } from './modification-modal.component';

describe('ModificationModalComponent', () => {
  let component: ModificationModalComponent;
  let fixture: ComponentFixture<ModificationModalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ModificationModalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModificationModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
