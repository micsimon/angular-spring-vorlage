import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {HomeResponse} from "./model/home-response.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'frontend';

  constructor(private httpClient: HttpClient) {
  }

  public setNewTitle(): void {
    this.httpClient.get('/api/home').subscribe((response: HomeResponse) => {
      this.title = response.content
    });
  }

}
