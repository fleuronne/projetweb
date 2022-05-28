package org.isj.ing.travel.webapp.Travel.mapper;

import org.isj.ing.travel.webapp.Travel.model.dto.ClientDto;
import org.isj.ing.travel.webapp.Travel.model.dto.VilleDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Client;
import org.isj.ing.travel.webapp.Travel.model.entities.Ville;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy =  NullValueCheckStrategy.ALWAYS)
public interface VilleMapper {

        Ville toEntity(VilleDto villeDto);

       VilleDto toDto(Ville ville);

        void copy(VilleDto villeDto, @MappingTarget Ville ville);


}
