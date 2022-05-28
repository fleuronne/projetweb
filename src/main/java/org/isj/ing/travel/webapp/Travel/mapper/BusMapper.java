package org.isj.ing.travel.webapp.Travel.mapper;

import org.isj.ing.travel.webapp.Travel.model.dto.BusDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Bus;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy =  NullValueCheckStrategy.ALWAYS)
public interface BusMapper {

        Bus toEntity(BusDto busDto);

        BusDto toDto(Bus bus);

        void copy(BusDto busDto, @MappingTarget Bus bus);

}
