package org.isj.ing.travel.webapp.Travel.mapper;

import javax.annotation.Generated;
import org.isj.ing.travel.webapp.Travel.model.dto.BusDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Bus;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T11:06:30+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class BusMapperImpl implements BusMapper {

    @Override
    public Bus toEntity(BusDto busDto) {
        if ( busDto == null ) {
            return null;
        }

        Bus bus = new Bus();

        return bus;
    }

    @Override
    public BusDto toDto(Bus bus) {
        if ( bus == null ) {
            return null;
        }

        BusDto busDto = new BusDto();

        return busDto;
    }

    @Override
    public void copy(BusDto busDto, Bus bus) {
        if ( busDto == null ) {
            return;
        }
    }
}
