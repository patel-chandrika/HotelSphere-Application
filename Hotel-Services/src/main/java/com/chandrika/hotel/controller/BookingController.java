package com.chandrika.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.chandrika.hotel.entities.Booking;
import com.chandrika.hotel.service.BookingService;
import com.chandrika.hotel.service.hotelService;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class BookingController {

    @Autowired
    private hotelService hotelService;

    @Autowired
    private BookingService bookingService;

    @PostMapping("/addBooking/{hotelId}/{userId}")
    public ResponseEntity<String> addBooking(@PathVariable String hotelId, @PathVariable String userId, @RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.bookRoom(hotelId,userId, booking));
    }

    @GetMapping("/getBooking/{bookingId}")
    public ResponseEntity<Booking> getBookingById(@PathVariable String bookingId) {
        return ResponseEntity.ok(bookingService.getBookingById(bookingId));
    }

    @GetMapping("/getAllBooking")
    public ResponseEntity<List<Booking>> getAllBooking() {
        return ResponseEntity.ok(bookingService.getAllBooking());
    }

    @GetMapping("/cancelBooking/{bookingId}")
    public ResponseEntity<String> cancelBooking(@PathVariable String bookingId) {
        return ResponseEntity.ok(bookingService.cancelBooking(bookingId));
    }

    @GetMapping("/completeBooking/{bookingId}")
    public ResponseEntity<String> completeBooking(@PathVariable String bookingId) {
        return ResponseEntity.ok(bookingService.completeBooking(bookingId));
    }
}
