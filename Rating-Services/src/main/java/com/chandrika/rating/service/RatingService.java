package com.chandrika.rating.service;

import java.util.List;

import com.chandrika.rating.entities.Rating;

public interface RatingService {

    public Rating addRating(Rating rating);

    public List<Rating> getRatingAll();

    public List<Rating> getRatingByUserId(String userId);

    public List<Rating> getRatingByHotelId(String hotelId);

}
