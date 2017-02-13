/* tslint:disable:no-unused-variable */
import {async, ComponentFixture, TestBed} from "@angular/core/testing";
import {SearchComponent} from "./search.component";
import {Ng2CompleterModule} from "ng2-completer";
import {FormsModule} from "@angular/forms";
import {BrowserModule} from "@angular/platform-browser";
import {HttpModule} from "@angular/http";
import {CommonModule} from "@angular/common";

fdescribe('SearchComponent', () => {
  let component: SearchComponent;
  let fixture: ComponentFixture<SearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [SearchComponent],
      imports: [BrowserModule,
        FormsModule,
        HttpModule,
        Ng2CompleterModule],
      CommonModule,
      providers: []
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {

    jQuery('input').val('re');
    jQuery('button').click();


    fixture.detectChanges();

    // jQuery('.completer-item-text').is(':visible')
    console.log(jQuery('.completer-item-text').length);
    console.log(jQuery('input').val());

  });

});
