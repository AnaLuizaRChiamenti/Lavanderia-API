package api.lavanderia.Lavanderia.database;

import api.lavanderia.Lavanderia.classes.Apartament;
import api.lavanderia.Lavanderia.classes.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {
    private static List<Apartament> apartments = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();

    public List<Apartament> getApartments() {
        return Database.apartments;
    }

    public List<Booking> getBookings() {
        return Database.bookings;
    }

    public void addBookings(Booking booking){
        bookings.add(booking);
    }

    public void addApartment(Apartament apartament){
        apartments.add(apartament);
    }

    public Optional<Apartament> getApartmentByNumber(String number){
        return  apartments.stream().
                filter(apt -> apt.getNumber().equalsIgnoreCase(number)).
                findFirst();
    };
}
