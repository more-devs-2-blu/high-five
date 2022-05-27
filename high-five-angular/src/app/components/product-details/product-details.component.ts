import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Review } from 'src/app/models/review/review.component';
import { ReviewService } from 'src/app/service/review.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.scss']
})
export class ProductDetailsComponent implements OnInit {

  id!: number;
  review: Review | undefined;

  constructor (private reviewService: ReviewService, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.params['id'];
    this.review = new Review();
    this.reviewService.getReviewById(this.id).subscribe(data => {this.review = data;
    });
  }
}
