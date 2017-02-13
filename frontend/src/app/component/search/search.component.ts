import {Component, ViewChild, ElementRef} from "@angular/core";
import {CompleterData, CompleterService, CompleterCmp} from "ng2-completer";

@Component({
  selector: 'app-search',
  templateUrl: 'search.component.html',
  styleUrls: ['search.component.less']
})
export class SearchComponent {

  @ViewChild(CompleterCmp) completer: CompleterCmp;

  private dataService: CompleterData;
  private searchData = [
    {color: 'red', value: '#f00'},
    {color: 'green', value: '#0f0'},
    {color: 'blue', value: '#00f'},
    {color: 'cyan', value: '#0ff'},
    {color: 'magenta', value: '#f0f'},
    {color: 'yellow', value: '#ff0'},
    {color: 'black', value: '#000'}
  ];


  constructor(private completerService: CompleterService, private myElement: ElementRef) {
    this.dataService = completerService.local(this.searchData, 'color', 'color');
  }

  public onOpen() {
    console.log('###', this.dataService);


    let searchString: string = this.myElement.nativeElement.querySelector('input').value;
    this.completer.open(searchString);
  }

}
