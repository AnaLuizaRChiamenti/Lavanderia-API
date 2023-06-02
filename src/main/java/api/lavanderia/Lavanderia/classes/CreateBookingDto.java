package api.lavanderia.Lavanderia.classes;

import api.lavanderia.Lavanderia.enums.Machine;
import api.lavanderia.Lavanderia.enums.Shift;

import java.time.LocalDate;

public record CreateBookingDto(String apartment, Machine machine, LocalDate date, Shift hour) {

}
