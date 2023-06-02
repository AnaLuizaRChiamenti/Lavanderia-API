package api.lavanderia.Lavanderia.controllers;

import api.lavanderia.Lavanderia.classes.Booking;
import api.lavanderia.Lavanderia.classes.CreateBookingDto;
import api.lavanderia.Lavanderia.database.Database;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    Database database;

   public BookingController() {
       database = new Database();
   }

    @GetMapping
    public List<Booking> getAll() {
        return database.getBookings();
    }

    @PostMapping
    public Booking create(@RequestBody CreateBookingDto newBooking) {
        var apt = database.getApartmentByNumber(newBooking.apartment());
        var booking = new Booking(newBooking, apt);
        database.addBookings(booking);

        return booking;
    }
}