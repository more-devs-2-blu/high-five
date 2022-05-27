import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Review } from '../models/review/review.component';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class ReviewService {

  constructor(private httpClient: HttpClient) { }

  //LISTAR TODAS AVALIAÇÕES
  getReviewList(): Observable<Review[]> {
    return this.httpClient.get<Review[]>(`${environment.apiUrl}`);
  }

  //LISTAR AVALIAÇÃO PELO ID
  getReviewById(id: number): Observable<Review> {
    return this.httpClient.get(`${environment.apiUrl}/${id}`);
  }

  //ADICIONAR NOVA AVALIAÇÃO
  createReview(review: Review): Observable<Object> {
    return this.httpClient.post(`${environment.apiUrl}`, review);
  }

  //ATUALIZAR AVALIAÇÃO ATUAL USANDO O ID
  updateReview(id: number, review: Review): Observable<Object> {
    return this.httpClient.put(`${environment.apiUrl}/${id}`, review);
  }

}



