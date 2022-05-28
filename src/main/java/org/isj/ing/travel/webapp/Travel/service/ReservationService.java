package org.isj.ing.travel.webapp.Travel.service;

import lombok.extern.slf4j.Slf4j;

import org.isj.ing.travel.webapp.Travel.model.dto.ReservationDto;
import org.isj.ing.travel.webapp.Travel.mapper.*;
import org.isj.ing.travel.webapp.Travel.model.entities.Reservation;
import org.isj.ing.travel.webapp.Travel.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
//@Transactional
public class ReservationService implements IReservation {

    @Autowired
     ReservationRepository reservationRepository;
    @Autowired
     ReservationMapper reservationMapper;

    @Override
    public int saveReservation(ReservationDto reservationDto) {
        return reservationRepository.save(reservationMapper.toEntity(reservationDto)).getIdreservation().intValue();
    }

    @Override
    public ReservationDto searchReservationNumero(String numerochaise) {
        return reservationMapper.toDto(reservationRepository.findReservationByNumerochaise(numerochaise).get());
    }

    @Override
    public List<ReservationDto> listreservation() {
        return reservationRepository.findAll().stream()
                .map(reservationMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public int deleteReservation(String numerochaise) {
        reservationRepository.deleteById(reservationRepository.findReservationByNumerochaise(numerochaise).get().getIdreservation());
        return 1;
    }

    @Override
    public List<ReservationDto> searchReservationByKeyword(String keyword) {
        return reservationRepository.findReservationByNumerochaiseOrClasse(keyword, keyword).get().stream()
                .map(reservationMapper::toDto)
                .collect(Collectors.toList());
    }
}