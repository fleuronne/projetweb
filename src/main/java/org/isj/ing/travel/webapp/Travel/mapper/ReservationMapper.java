package org.isj.ing.travel.webapp.Travel.mapper;

import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.model.dto.VilleDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Reservation;
import org.isj.ing.travel.webapp.Travel.model.entities.Ville;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy =  NullValueCheckStrategy.ALWAYS)

public interface ReservationMapper {

    Reservation toEntity(ReservationDto reservationDto);

    ReservationDto toDto(Reservation reservation);

    void copy(ReservationDto reservationDto, @MappingTarget Reservation reservation);
}
