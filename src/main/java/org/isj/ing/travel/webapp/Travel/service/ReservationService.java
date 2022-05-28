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

@Slf4j
@Service
@Transactional
public class ReservationService {
    @Autowired
    private ReservationRepository repository;
    @Autowired
    private ReservationMapper reservationMapper;

    public ReservationDto save(ReservationDto reservationDto) {
        Reservation entity = reservationMapper.toEntity(reservationDto);
        return reservationMapper.toDto(repository.save(entity));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public ReservationDto findById(Long id) {
        return reservationMapper.toDto(repository.findById(id).get());
    }

    public Page<ReservationDto> findByCondition(ReservationDto reservationDto, Pageable pageable) {
        Page<Reservation> entityPage = repository.findAll(pageable);
        List<Reservation> entities = entityPage.getContent();
        return new PageImpl<>(reservationMapper.toDto(entities), pageable, entityPage.getTotalElements());
    }

    public ReservationDto update(ReservationDto reservationDto, Long id) {
        ReservationDto data = findById(id);
        Reservation entity = reservationMapper.toEntity(reservationDto);
        reservationMapper.copy(data, entity);
        return save(reservationMapper.toDto(entity));
    }
}