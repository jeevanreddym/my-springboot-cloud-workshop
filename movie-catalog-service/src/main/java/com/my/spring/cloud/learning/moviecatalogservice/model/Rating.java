package com.my.spring.cloud.learning.moviecatalogservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private String movieId;
    private int rating;

}
