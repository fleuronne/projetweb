package org.isj.ing.travel.webapp.Travel.mapper;

import javax.annotation.Generated;
import org.isj.ing.travel.webapp.Travel.model.dto.ClientDto;
import org.isj.ing.travel.webapp.Travel.model.entities.Client;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T11:06:30+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public Client toEntity(ClientDto clientDto) {
        if ( clientDto == null ) {
            return null;
        }

        Client client = new Client();

        return client;
    }

    @Override
    public ClientDto toDto(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDto clientDto = new ClientDto();

        return clientDto;
    }

    @Override
    public void copy(ClientDto clientDto, Client client) {
        if ( clientDto == null ) {
            return;
        }
    }
}
