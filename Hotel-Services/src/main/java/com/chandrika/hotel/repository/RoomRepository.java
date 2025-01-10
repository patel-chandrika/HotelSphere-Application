package com.chandrika.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandrika.hotel.entities.Room;


public interface RoomRepository extends JpaRepository<Room, String> {
}
