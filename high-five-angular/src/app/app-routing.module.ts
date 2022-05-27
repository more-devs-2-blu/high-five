import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductDetailsComponent } from './components/product-details/product-details.component';
import { ProductSelectionComponent } from './components/product-selection/product-selection.component';
import { ReviewComponent } from './components/review/review.component';


const routes: Routes = [
  { path: '', redirectTo: '/review', pathMatch: 'full'}, //adicionar path   
  { path: 'review', component: ReviewComponent},
  { path: 'product-details', component: ProductDetailsComponent},
  { path: 'product-selection', component: ProductSelectionComponent},
  { path: 'product-details', component: ProductDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
