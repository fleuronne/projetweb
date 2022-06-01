package org.isj.ing.travel.webapp.Travel.service;

import org.isj.ing.travel.webapp.Travel.model.dto.BusDto;
import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;

import java.util.List;

public interface IBus {
    int saveBus(BusDto busDto);

    BusDto searchBusNumero(String numeroBus);

    List<BusDto> listbus();

    int deleteBus(String numeroBus);

    List<BusDto> searchBusByKeyword(String keyword);
}
