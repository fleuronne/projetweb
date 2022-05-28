package org.isj.ing.travel.webapp.Travel.service;

import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;

import java.util.List;

public interface IReservation {
    int saveReservation(ReservationDto reservationDto);

    ReservationDto searchReservationNumero(String numerochaise);

    List<ReservationDto> listreservation();

    int deleteReservation(String numerochaise);

    List<ReservationDto> searchReservationByKeyword(String keyword);
}
