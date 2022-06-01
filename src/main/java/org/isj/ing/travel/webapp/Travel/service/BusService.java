package org.isj.ing.travel.webapp.Travel.service;

import org.isj.ing.travel.webapp.Travel.mapper.BusMapper;
import org.isj.ing.travel.webapp.Travel.mapper.ReservationMapper;
import org.isj.ing.travel.webapp.Travel.model.dto.BusDto;
import org.isj.ing.travel.webapp.Travel.repository.BusRepository;
import org.isj.ing.travel.webapp.Travel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusService implements IBus{
    @Autowired
    BusRepository busRepository;
    @Autowired
    BusMapper busMapper;

    @Override
    public int saveBus(BusDto busDto) {
        return busRepository.save(busMapper.toEntity(busDto)).getIdbus().intValue();
    }

    @Override
    public BusDto searchBusNumero(String numeroBus) {
        return busMapper.toDto(busRepository.findBusByNumeroBus(numeroBus).get());
    }

    @Override
    public List<BusDto> listbus() {
        return busRepository.findAll().stream()
                .map(busMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public int deleteBus(String numeroBus) {
        busRepository.deleteById(busRepository.findBusByNumeroBus(numeroBus).get().getIdbus());
        return 1;
    }

    @Override
    public List<BusDto> searchBusByKeyword(String keyword) {
        return busRepository.findBusByNumeroBusOrNombrePlace(keyword, keyword).get().stream()
                .map(busMapper::toDto)
                .collect(Collectors.toList());
    }
}
