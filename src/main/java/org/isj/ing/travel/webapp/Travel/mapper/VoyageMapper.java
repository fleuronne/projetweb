package org.isj.ing.travel.webapp.Travel.mapper;

import org.isj.ing.travel.webapp.Travel.model.dto.VilleDto;
import org.isj.ing.travel.webapp.Travel.model.dto.VoyageDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Ville;
import org.isj.ing.travel.webapp.Travel.model.entities.Voyage;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy =  NullValueCheckStrategy.ALWAYS)
public interface VoyageMapper {

        Voyage toEntity(VoyageDto voyageDto);

        VoyageDto toDto(Voyage voyage);

        void copy(VoyageDto voyageDto, @MappingTarget Voyage voyage);


}
