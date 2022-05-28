package org.isj.ing.travel.webapp.Travel.mapper;

import org.isj.ing.travel.webapp.Travel.model.dto.BusDto;
import org.isj.ing.travel.webapp.Travel.model.dto.ClientDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Bus;
import org.isj.ing.travel.webapp.Travel.model.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy =  NullValueCheckStrategy.ALWAYS)
public interface ClientMapper {
    Client toEntity(ClientDto clientDto);

    ClientDto toDto(Client client);

    void copy(ClientDto clientDto, @MappingTarget Client client);
}
