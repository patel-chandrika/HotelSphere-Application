package com.chandrika.rating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandrika.rating.entities.Rating;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {

    public List<Rating> findByUserId(String userId);
    public List<Rating> findByHotelId(String hotelId);
}
