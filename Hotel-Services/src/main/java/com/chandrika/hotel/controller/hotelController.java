package com.chandrika.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.chandrika.hotel.HotelServiceApplication;
import com.chandrika.hotel.entities.Hotel;
import com.chandrika.hotel.entities.Room;
import com.chandrika.hotel.service.hotelService;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class hotelController {

    @Autowired
    private hotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
        return ResponseEntity.ok(hotelService.addHotel(hotel));
    }
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId) {
        return ResponseEntity.ok(hotelService.getHotelById(hotelId));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }

    @DeleteMapping("/{hotelId}")
    public ResponseEntity<Hotel> deleteHotelById(@PathVariable String hotelId) {
        return ResponseEntity.ok(hotelService.deleteHotelById(hotelId));
    }

    @PostMapping("/{hotelId}/rooms")
    public ResponseEntity<Room> addRoom(@PathVariable String hotelId, @RequestBody Room hotel) {
        return ResponseEntity.ok(hotelService.addRoom(hotelId, hotel));
    }

    @GetMapping("/{hotelId}/rooms/{roomId}")
    public ResponseEntity<Room> getRoomById(@PathVariable String roomId) {
        return ResponseEntity.ok(hotelService.getRoomById(roomId));
    }

    @GetMapping("/{hotelId}/available")
    public ResponseEntity<List<Room>> getAllAvailableRoom(@PathVariable String hotelId) {
        return ResponseEntity.ok(hotelService.getAllAvailableRoom(hotelId));
    }

    @GetMapping("/{hotelId}/rooms/booked")
    public ResponseEntity<List<Room>> getAllBookedRoom(@PathVariable String hotelId) {
        return ResponseEntity.ok(hotelService.getAllBookedRoom(hotelId));
    }

    @GetMapping("/{hotelId}/getAllRooms")
    public ResponseEntity<List<Room>> getAllRooms(@PathVariable String hotelId) {
        return ResponseEntity.ok(hotelService.getAllRooms(hotelId));
    }


    @DeleteMapping("/{hotelId}/rooms/{roomId}")
    public ResponseEntity<Room> deleteRoomById(@PathVariable String roomId) {
        return ResponseEntity.ok(hotelService.deleteRoomById(roomId));
    }


    @GetMapping("/location/{location}")
    public ResponseEntity<List<Hotel>> getHotelByLocation(@PathVariable String location) {
        return ResponseEntity.ok(hotelService.getHotelByLocation(location));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Hotel> getHotelByName(@PathVariable String name) {
        return ResponseEntity.ok(hotelService.getHotelByName(name));
    }

}
