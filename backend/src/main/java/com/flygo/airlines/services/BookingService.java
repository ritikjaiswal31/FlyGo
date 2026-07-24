package com.flygo.airlines.services;

import com.flygo.airlines.dtos.BookingDTO;
import com.flygo.airlines.dtos.CreateBookingRequest;
import com.flygo.airlines.dtos.Response;
import com.flygo.airlines.enums.BookingStatus;

import java.util.List;

public interface BookingService {

    Response<?> createBooking(CreateBookingRequest createBookingRequest);
    Response<BookingDTO> getBookingById(Long id);
    Response<List<BookingDTO>> getAllBookings();
    Response<List<BookingDTO>> getMyBookings();
    Response<?> updateBookingStatus(Long id, BookingStatus status);
}
