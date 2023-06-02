package api.lavanderia.Lavanderia.classes;

import api.lavanderia.Lavanderia.enums.Machine;
import api.lavanderia.Lavanderia.enums.Shift;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Booking {
    private Apartament apartament;

    private LocalDate date;

    private Shift hour;

    private Machine machine;

    public Booking(CreateBookingDto newBooking, Apartament apt){
        apartament = apt;
        date = newBooking.date();
        hour = newBooking.hour();
        machine = newBooking.machine();
    }
}
