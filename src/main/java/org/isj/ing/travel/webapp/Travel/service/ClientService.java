package org.isj.ing.travel.webapp.Travel.service;

import org.isj.ing.travel.webapp.Travel.mapper.ClientMapper;
import org.isj.ing.travel.webapp.Travel.mapper.ReservationMapper;
import org.isj.ing.travel.webapp.Travel.model.dto.ClientDto;
import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.repository.ClientRepository;
import org.isj.ing.travel.webapp.Travel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ClientService implements IClient {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    ClientMapper clientMapper;

    @Override
    public int saveClient(ClientDto clientDto) {
        return clientRepository.save(clientMapper.toEntity(clientDto)).getIdclient().intValue();
    }

    @Override
    public ClientDto searchClientNumerocni(String numerocni) {
        return clientMapper.toDto(clientRepository.findClientByNumerocni(numerocni).get());
    }

    @Override
    public List<ClientDto> listclient() {
        return clientRepository.findAll().stream()
                .map(clientMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public int deleteClient(String numerocni) {
        clientRepository.deleteById(clientRepository.findClientByNumerocni(numerocni).get().getIdclient());
        return 1;
    }

    @Override
    public List<ClientDto> searchClientByKeyword(String keyword) {
        return clientRepository.findClientByNumerocniOrNumerotelephone(keyword, keyword).get().stream()
                .map(clientMapper::toDto)
                .collect(Collectors.toList());
    }
}
