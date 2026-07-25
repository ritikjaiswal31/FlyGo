package com.flygo.airlines.services;
import com.flygo.airlines.entities.Booking;
import com.flygo.airlines.entities.User;

public interface EmailNotificationService {

    void sendBookingTickerEmail(Booking booking);
    void sendWelcomeEmail(User user);

}
