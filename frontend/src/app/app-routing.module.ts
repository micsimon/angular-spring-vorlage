import {Routes, RouterModule} from "@angular/router";
import {NgModule} from "@angular/core";
import {SearchComponent} from "./component/search/search.component";

const routes: Routes = [
  {path: '**', component: SearchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  providers: []
})
export class RoutingModule {
}
