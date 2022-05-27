import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Review } from 'src/app/models/review/review.component';
import { ReviewService } from 'src/app/service/review.service';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.scss']
})
export class ReviewComponent implements OnInit {

  review: Review = new Review();

  constructor(private reviewService: ReviewService, private router: Router) { }

  ngOnInit(): void {
  }

  reviewSave() {
    this.reviewService.createReview(this.review).subscribe(data => {
      console.log('SALVA AVALIAÇÃO')
      console.log(data);
      this.sendToProductDetailsList();
    },
    error => console.log(error));
 }

  sendToProductDetailsList(){
    this.router.navigate(['/product-details']);
  }

  onSubmit(){
    console.log(this.review);
    this.reviewSave()
  }


// --------------------------------

  formatLabel(value: number) {
    if (value = 50) {
      return '100';
    }
    if (value != 50) {
      return '0';
    }
    console.log (value)
    console.log (this.formatLabel)
    return value;
  }

  onInputChange(event: any) {
    console.log("VALOR DO SLIDER")
    console.log(event.value);
  }

}
