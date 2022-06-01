package org.isj.ing.travel.webapp.Travel.service;

import org.isj.ing.travel.webapp.Travel.model.dto.ClientDto;

import java.util.List;

public interface IClient {
    int saveClient(ClientDto clientDto);

    ClientDto searchClientNumerocni(String numerocni);

    List<ClientDto> listclient();

    int deleteClient(String numerocni);

    List<ClientDto> searchClientByKeyword(String keyword);
}
