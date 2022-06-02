package org.isj.ing.travel.webapp.Travel.mapper;

import javax.annotation.Generated;
import org.isj.ing.travel.webapp.Travel.model.dto.VilleDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Ville;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T11:06:29+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class VilleMapperImpl implements VilleMapper {

    @Override
    public Ville toEntity(VilleDto villeDto) {
        if ( villeDto == null ) {
            return null;
        }

        Ville ville = new Ville();

        return ville;
    }

    @Override
    public VilleDto toDto(Ville ville) {
        if ( ville == null ) {
            return null;
        }

        VilleDto villeDto = new VilleDto();

        return villeDto;
    }

    @Override
    public void copy(VilleDto villeDto, Ville ville) {
        if ( villeDto == null ) {
            return;
        }
    }
}
