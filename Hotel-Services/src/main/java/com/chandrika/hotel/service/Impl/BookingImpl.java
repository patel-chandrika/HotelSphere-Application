package com.chandrika.hotel.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandrika.hotel.entities.*;
import com.chandrika.hotel.exception.NotFoundException;
import com.chandrika.hotel.repository.BookingRepository;
import com.chandrika.hotel.repository.HotelRepository;
import com.chandrika.hotel.repository.RoomRepository;
import com.chandrika.hotel.service.BookingService;

import java.util.List;

@Service
public class BookingImpl implements BookingService {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public String bookRoom(String hotelId, String userId, Booking book) {

        Hotel hotel = hotelRepository.findById(hotelId).orElseThrow( () -> new NotFoundException("Hotel not found with id: " + hotelId + ""));

        Room room = roomRepository.findById(book.getRoomId()).orElseThrow( () -> new NotFoundException("Room not found with id: " + book.getRoomId() + ""));

        if(room.getStatus().equals(Status.BOOKED)) {
            return "ROOM ALREADY BOOKED";
        }

        Booking booking = new Booking();
        booking.setHotel(hotel);
        booking.setRoomId(book.getRoomId());
        booking.setBookingId(book.getBookingId());
        booking.setAmount(book.getAmount());
        booking.setPaymentStatus(book.getPaymentStatus());
        booking.setBookingDate(book.getBookingDate());
        booking.setCheckOutDate(book.getCheckOutDate());
        booking.setUserId(userId);

        room.setStatus(Status.BOOKED);
        bookingRepository.save(booking);
        return "BOOKED";

    }

    @Override
    public Booking getBookingById(String bookingId) {
        return bookingRepository.findById(bookingId).orElseThrow( () -> new NotFoundException("Booking not found with id: " + bookingId + ""));
    }

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public String cancelBooking(String bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElseThrow( () -> new NotFoundException("Booking not found with id: " + bookingId + ""));

        Room room = roomRepository.findById(booking.getRoomId()).orElseThrow( () -> new NotFoundException("Room not found with id: " + booking.getRoomId() + ""));

        if (room.getStatus().equals(Status.AVAILABLE)) {
            return "ROOM ALREADY AVAILABLE";
        }
        room.setStatus(Status.AVAILABLE);
        roomRepository.save(room);
        return "CANCELLED";
    }

    @Override
    public String completeBooking(String bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElseThrow( () -> new NotFoundException("Booking not found with id: " + bookingId + ""));

        Room room = roomRepository.findById(booking.getRoomId()).orElseThrow( () -> new NotFoundException("Room not found with id: " + booking.getRoomId() + ""));

        room.setStatus(Status.AVAILABLE);
        roomRepository.save(room);
        return "COMPLETED";
    }


}
