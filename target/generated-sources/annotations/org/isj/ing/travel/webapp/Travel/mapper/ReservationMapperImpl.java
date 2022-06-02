package org.isj.ing.travel.webapp.Travel.mapper;

import javax.annotation.Generated;
import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Reservation;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T11:06:29+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public Reservation toEntity(ReservationDto reservationDto) {
        if ( reservationDto == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        return reservation;
    }

    @Override
    public ReservationDto toDto(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationDto reservationDto = new ReservationDto();

        return reservationDto;
    }

    @Override
    public void copy(ReservationDto reservationDto, Reservation reservation) {
        if ( reservationDto == null ) {
            return;
        }
    }
}
