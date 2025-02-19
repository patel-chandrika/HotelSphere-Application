package com.chandrika.rating.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.chandrika.rating.entities.Rating;
import com.chandrika.rating.service.RatingService;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;


    @PostMapping("/add")
    public ResponseEntity<Rating> addRatingHandler(@RequestBody Rating rating){
        return ResponseEntity.ok(ratingService.addRating(rating));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Rating>> getRatingAllHandler(){
        return ResponseEntity.ok(ratingService.getRatingAll());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserIdHandler(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }


    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelIdHandler(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }
}
