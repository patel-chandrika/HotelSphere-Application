package com.chandrika.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandrika.hotel.entities.Hotel;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {
    public List<Hotel> findByLocation(String location);
    public Hotel findByName(String name);
}
