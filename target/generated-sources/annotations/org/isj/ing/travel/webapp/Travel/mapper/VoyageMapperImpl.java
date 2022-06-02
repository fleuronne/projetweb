package org.isj.ing.travel.webapp.Travel.mapper;

import javax.annotation.Generated;
import org.isj.ing.travel.webapp.Travel.model.dto.VoyageDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Voyage;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T11:06:30+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class VoyageMapperImpl implements VoyageMapper {

    @Override
    public Voyage toEntity(VoyageDto voyageDto) {
        if ( voyageDto == null ) {
            return null;
        }

        Voyage voyage = new Voyage();

        return voyage;
    }

    @Override
    public VoyageDto toDto(Voyage voyage) {
        if ( voyage == null ) {
            return null;
        }

        VoyageDto voyageDto = new VoyageDto();

        return voyageDto;
    }

    @Override
    public void copy(VoyageDto voyageDto, Voyage voyage) {
        if ( voyageDto == null ) {
            return;
        }
    }
}
