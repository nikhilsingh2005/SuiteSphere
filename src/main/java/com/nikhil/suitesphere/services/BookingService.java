package com.nikhil.suitesphere.services;

import com.nikhil.suitesphere.dtos.BookingDTO;
import com.nikhil.suitesphere.dtos.Response;

public interface BookingService {

    Response getAllBookings();

    Response createBooking(BookingDTO bookingDTO);

    Response findBookingByReferenceNo(String bookingReference);

    Response updateBooking(BookingDTO bookingDTO);
}

